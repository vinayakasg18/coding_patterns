package oas.twitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ActivateFountain {

	public static void main(String[] args) {
		int ans = min(new ArrayList<>(Arrays.asList(0, 1, 0)));
		System.out.println(ans);
	}

	public static int min(List<Integer> list) {

		int[][] matrix = new int[list.size()][2];
		for (int i = 0; i < list.size(); i++) {
			matrix[i][0] = Math.max((i + 1) - list.get(i), 1);
			matrix[i][1] = Math.min((i + 1) + list.get(i), list.size());
		}

		Arrays.sort(matrix, (a, b) -> {
			if (a[1] == b[1]) {
				return a[0] - b[0];
			} else {
				return b[1] - a[1];
			}
		});

		int start = matrix[0][0];
		int end = matrix[0][1];
		int count = 1;
		for (int i = 1; i < matrix.length; i++) {
			int currentStart = matrix[i][0];
			int currentEnd = matrix[i][1];
			if (currentStart >= start && currentEnd <= end) {
				continue;
			} else {
				count++;
				start = Math.min(currentStart, start);
				end = Math.max(currentEnd, end);
			}
		}
		return count;
	}

}
