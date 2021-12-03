package racingcar.utils;

public class Validation {

	private static final String NUMBER_ERROR_MESSAGE = "시도 횟수는 숫자여야 한다.";

	public static void isNumber(String s) throws IllegalArgumentException {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				throw new IllegalArgumentException(NUMBER_ERROR_MESSAGE);
			}
		}
	}
}
