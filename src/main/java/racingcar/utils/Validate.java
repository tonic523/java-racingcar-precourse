package racingcar.utils;

public class Validate {
	public static void containComma(String input) throws IllegalArgumentException {
		if (!input.contains(",")) {
			throw new IllegalArgumentException("쉼표가 포함되어야 한다.");
		}
	}
}
