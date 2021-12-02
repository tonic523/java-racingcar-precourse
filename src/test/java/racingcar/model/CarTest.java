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

	@DisplayName("4이상이면 전진")
	@Test
	void moveForward() {
		Car car = new Car("car");
		car.moveForward(4);
		assertThat(car.getPosition()).isEqualTo(1);
		car.moveForward(3);
		assertThat(car.getPosition()).isEqualTo(1);
	}
}
