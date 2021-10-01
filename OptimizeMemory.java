import java.util.*;

class OptimizeMemory {
	public static int[][] findPairs(int[] foregroundTasks, int[] backgroundTasks, int K) {
		int max = Integer.MIN_VALUE;
		List<int[]> result = new ArrayList<>();
		for (int i = 0; i < foregroundTasks.length; i++) {
			for (int j = 0; j < backgroundTasks.length; j++) {
				int sum = foregroundTasks[i] + backgroundTasks[j];
				if (sum <= K) {
					if (sum > max) {
						max = sum;
						result.clear();
						result.add(new int[] { i, j });
					} else if (sum == max) {
						result.add(new int[] { i, j });
					}
				}
			}
		}

		for (int i = 0; i < foregroundTasks.length; i++) {
			if (foregroundTasks[i] <= K) {
				if (foregroundTasks[i] > max) {
					result.clear();
					max = foregroundTasks[i];
					result.add(new int[] { i, -1 });
				} else if (foregroundTasks[i] == max) {
					result.add(new int[] { i, -1 });
				}
			}
		}

		for (int i = 0; i < backgroundTasks.length; i++) {
			if (backgroundTasks[i] <= K) {
				if (backgroundTasks[i] > max) {
					result.clear();
					max = backgroundTasks[i];
					result.add(new int[] { -1, i });
				} else if (backgroundTasks[i] == max) {
					result.add(new int[] { -1, i });
				}
			}
		}

		int[][] response = new int[result.size()][2];
		int i = 0;
		for (int[] row : result) {
			response[i][0] = row[0];
			response[i][1] = row[1];
			i++;
		}
		return response;
	}

	public static void main(String[] args) {
		int[] foregroundTasks = new int[] { 1, 7, 2, 4, 5, 6 };
		int[] backgroundTasks = new int[] { 3, 1, 2 };
		int k = 6;
		int[][] response = findPairs(foregroundTasks, backgroundTasks, k);
		for (int i = 0; i < response.length; i++) {
			for (int j = 0; j < response[i].length; j++) {
				System.out.print(response[i][j] + " ");
			}
			System.out.println();
		}
	}
}