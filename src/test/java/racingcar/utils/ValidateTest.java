package racingcar.utils;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidateTest {
	@DisplayName("숫자인지 검사")
	@ParameterizedTest
	@ValueSource(strings = {"a", "a123", "abc"})
	void isNumber(String testcase) {
		assertThatThrownBy(() -> Validate.isNumber(testcase))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("[ERROR] 시도 횟수는 숫자여야 한다.");
	}
}