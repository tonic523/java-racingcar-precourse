package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {
	@DisplayName("차의 이름 유효성 검사")
	@Test
	public void validateName() {
		assertThatThrownBy(() -> new Car("carName"))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("자동차 이름은 1~5자여야 한다.");
	}
}
