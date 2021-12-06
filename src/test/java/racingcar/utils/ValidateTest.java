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
}
