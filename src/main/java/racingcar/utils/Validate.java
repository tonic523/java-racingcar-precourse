package racingcar.utils;

public class Validate {
	public static void containComma(String input) throws IllegalArgumentException {
		if (!input.contains(",")) {
			throw new IllegalArgumentException("쉼표가 포함되어야 한다.");
		}
	}

	public static void correctLength(String input) throws IllegalArgumentException {
		int length = input.length();
		if (length < 1 || length > 5) {
			throw new IllegalArgumentException("자동차 이름은 1~5자여야 한다.");
		}
	}

	public static void isNumber(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isDigit(input.charAt(i))) {
				throw new IllegalArgumentException("시도 횟수는 숫자여야 한다.");
			}
		}
	}

	public static void isZero(String input) throws IllegalArgumentException {
		if (Integer.parseInt(input) == 0) {
			throw new IllegalArgumentException("회수는 0이면 안된다.");
		}
	}
}
