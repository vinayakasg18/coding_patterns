package oas.sig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CryptoTrading {
	public static void main(String[] args) {
		String[] operations = new String[] { "buy 1 3 2", "sell 1 4 10", "deposit 2 12", "buy 2 10 2", "buy 2 6 3" };

		getPrices(new int[] { 9, 7, 12 }, operations);
	}

	public static int[] getPrices(int[] deposits, String[] operations) {
		int[] resBalance = new int[operations.length];
		Map<Integer, List<Integer>> AccMap = new HashMap<>();

		for (int i = 0; i < deposits.length; i++) {
			AccMap.put(i + 1, new ArrayList<>(Arrays.asList(deposits[i], 0)));
		}

		int index = 0;
		for (String op : operations) {
			String[] ops = op.split(" ");
			String transact = ops[0];
			int uid = Integer.valueOf(ops[1]);
			int cryptos = Integer.valueOf(ops[2]);
			int amt = 0;
			if (ops.length > 3) {
				amt = Integer.valueOf(ops[3]);
			}

			switch (transact) {
			case "buy":
				int buyPrice = cryptos * amt;
				if (AccMap.get(uid).get(0) >= buyPrice) {
					int balanceAmt = AccMap.get(uid).get(0);
					int cryptosToBuy = AccMap.get(uid).get(1);
					AccMap.get(uid).set(0, balanceAmt - buyPrice);
					AccMap.get(uid).set(1, cryptosToBuy + cryptos);
				}
				break;
			case "sell":
				int cryptosToSell = AccMap.get(uid).get(1);
				if (cryptosToSell >= cryptos) {
					int amount = AccMap.get(uid).get(0);
					AccMap.get(uid).set(0, amount + cryptos * amt);
					AccMap.get(uid).set(1, cryptosToSell - cryptos);
				}
				break;
			case "deposit":
				int depositAmount = AccMap.get(uid).get(0);
				AccMap.get(uid).set(0, depositAmount + cryptos);
				break;
			}
			resBalance[index++] = AccMap.get(uid).get(0);
		}
		return resBalance;
	}
}