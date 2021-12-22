package oas.mckinsey;

import java.util.LinkedList;

public class ReachEnd {

//	static int energy = Integer.MAX_VALUE;
	static boolean flag = false;

	public static void main(String[] args) {
		int[][] grid = new int[][] { { 0, 0, 1, 1 }, { 1, 0, 1, 1 }, { 1, 0, 0, 0 } };
		LinkedList<String> visited = new LinkedList<String>();
		int row = 0;
		int column = 0;
		System.out.println(DFS(row, column, new LinkedList<>(), visited, 0, grid, 5));
	}

	public static boolean DFS(int row, int column, LinkedList<String> path, LinkedList<String> visited,
			int currentEnergy, int[][] grid, int maxTime) {

		if (row == grid.length - 1 && column == grid[0].length - 1 && currentEnergy <= maxTime) {
			visited.add(row + "" + column);
//			path.add(row + "" + column);
			return true;

		} else if (row == grid.length - 1 && column == grid[0].length - 1 && currentEnergy > maxTime) {
			visited.add(row + "" + column);
			currentEnergy = currentEnergy - 1;
			return false;
		}

		if ((row > grid.length - 1 || row < 0) || (column > grid[0].length - 1 || column < 0)
				|| visited.contains(row + "" + column) || grid[row][column] == 1) {
			currentEnergy = currentEnergy - 1;
			return false;
		}

		visited.add(row + "" + column);
//		path.add(row + "" + column);
		currentEnergy = currentEnergy + 1;

		flag = flag || DFS(row, column + 1, path, visited, currentEnergy, grid, maxTime);
		flag = flag || DFS(row, column - 1, path, visited, currentEnergy, grid, maxTime);
		flag = flag || DFS(row + 1, column, path, visited, currentEnergy, grid, maxTime);
		flag = flag || DFS(row - 1, column, path, visited, currentEnergy, grid, maxTime);

		visited.removeLast();
//		path.removeLast();
		return flag;

	}

}
