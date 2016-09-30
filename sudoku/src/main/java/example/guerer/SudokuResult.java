package example.guerer;

public enum SudokuResult {
	NONE(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(
			8), NINE(9);

	private int r;

	SudokuResult(int r) {
		this.r = r;
	}

	public boolean done() {
		return this == NONE;
	}

	@Override
	public String toString() {
		return done() ? r + "" : " ";
	}

	public int value() {
		return r;
	}
}
