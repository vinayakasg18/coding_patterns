package oas.tiktok_oas;

import java.util.LinkedList;

// Not working: Need to debug
public class PacMan {

	static int energy = Integer.MAX_VALUE;
	static LinkedList<Integer> list = new LinkedList<>();

	public static void main(String[] args) {
		int[][] grid = new int[][] { { 1, 1, 0 }, { 1, 2, 0 }, { 0, 0, 0 } };
		DFS(grid.length - 1, 0, new LinkedList<>(), new LinkedList<>(), -1, 0, grid);

		System.out.println(energy);
		System.out.println(list);
	}

	public static void DFS(int row, int column, LinkedList<Integer> path, LinkedList<String> visited, int move,
			int currentEnergy, int[][] grid) {

		if (row == 0 && column == grid[0].length - 1) {
			path.add(move);
			visited.add(row + "" + column);
			if (currentEnergy < energy) {
				energy = currentEnergy;
				list = new LinkedList<>(path);
			}
			return;
		}

		if ((row > grid.length - 1 || row < 0) || (column > grid[0].length - 1 || column < 0)
				|| visited.contains(row + "" + column) || grid[row][column] == 1) {
			return;
		}

		visited.add(row + "" + column);
		path.add(move);
		if (grid[row][column] == 2) {
			currentEnergy = currentEnergy - 1;
		} else {
			currentEnergy = currentEnergy + 1;
		}

		DFS(row, column + 1, path, visited, 3, currentEnergy, grid);
		DFS(row, column - 1, path, visited, 2, currentEnergy, grid);
		DFS(row + 1, column, path, visited, 1, currentEnergy, grid);
		DFS(row - 1, column, path, visited, 0, currentEnergy, grid);

		visited.removeLast();
		path.removeLast();

	}
}
