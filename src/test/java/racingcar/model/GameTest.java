package racingcar.model;

import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameTest {
	@DisplayName("경주할 자동차는 2대 이상")
	@Test
	void validateCars() {
		List<Car> cars = Arrays.asList(
			new Car("car1")
		);
		Assertions.assertThatThrownBy(() -> new Game(cars))
			.isInstanceOf(IllegalArgumentException.class);
	}
}
