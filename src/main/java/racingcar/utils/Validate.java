package racingcar.utils;

public class Validate {

	private static final String isNumberErrorMessage = "[ERROR] 시도 횟수는 숫자여야 한다.";

	public static void isNumber(String string) {
		for (int i = 0; i < string.length(); i++) {
			isNumber(string.charAt(i));
		}
	}

	public static void isNumber(char c) {
		if (!Character.isDigit(c)) {
			throw new IllegalArgumentException(isNumberErrorMessage);
		}
	}
}
