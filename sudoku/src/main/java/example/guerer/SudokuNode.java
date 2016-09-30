package example.guerer;

import java.util.EnumSet;

public class SudokuNode {

	private SudokuResult result = SudokuResult.NONE;

	private EnumSet<SudokuResult> choices = EnumSet.allOf(SudokuResult.class);

	public SudokuResult result() {
		return result;
	}

	public EnumSet<SudokuResult> getChoices() {
		return choices;
	}

	public boolean done() {
		return result.done();
	}

	public boolean updateResultIfOnlyOneChoice() {
		if (!done() && choices.size() == 1) {
			result = choices.iterator().next();
			return true;
		}
		return false;
	}
}
