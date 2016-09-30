package example.guerer;

import java.util.Arrays;

public class App {

	private SudokuNode[][] sudoku;
	private ReduceChoiceStrategy[] strategies;

	public boolean done() {
		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku[i].length; j++) {
				if (!sudoku[i][j].done()) {
					return false;
				}
			}
		}
		return true;
	}

	public void compute() {
		boolean allStrategiesFail = false;
		while (!done() && !allStrategiesFail) {
			int i = 0;
			while (i < strategies.length && !computeOneStrategy(strategies[i])) {
				i++;
			}
			allStrategiesFail = i == strategies.length;
		}
	}

	public boolean computeOneStrategy(ReduceChoiceStrategy stragety) {
		return stragety.reduce(sudoku);
	}

	public void printResult() {

	}

	public void printRow(int r) {
		printRowSplit();
		String[][] row = new String[3][27];
		for (int i = 0; i < row.length; i++) {
			Arrays.fill(row[i], " ");
		}

		for (int i = 0; i < row.length; i++) {
			for (int j = 0; j < row[i].length; j++) {
				System.out.println(row[i][j]);
			}
			if (i < row.length - 1) {
				System.out.println("\n");
			}
		}
	}
	
	public void printRowSplit() {
		for(int i = 0; i < 27; i ++) {
			System.out.println(" -");
		}
	}

	public static void main(String[] args) {
	}
}
