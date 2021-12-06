package racingcar.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ValidateTest {
	@DisplayName("쉼표 유무")
	@Test
	public void containComma() {
		String input = "car1:car2";
		assertThatThrownBy(() -> Validate.containComma(input))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("쉼표가 포함되어야 한다.");
	}

	@DisplayName("자동차 이름은 1~5자")
	@Test
	public void correctLength() {
		String input = "carName";
		assertThatThrownBy(() -> Validate.correctLength(input))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("자동차 이름은 1~5자여야 한다.");
	}

	@DisplayName("숫자인지 검사")
	@Test
	public void isNumber() {
		String input = "a12";
		assertThatThrownBy(() -> Validate.isNumber(input))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("시도 횟수는 숫자여야 한다.");
	}

	@DisplayName("입력값이 0인지")
	@Test
	public void isZero() {
		String input = "0";
		assertThatThrownBy(() -> Validate.isZero(input))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("회수는 0이면 안된다.");
	}
}
