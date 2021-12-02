package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {
	@DisplayName("이름은 1~5자")
	@Test
	void validateName() {
		assertThatThrownBy(() -> new Car(""))
		.isInstanceOf(IllegalArgumentException.class);
	}
}
