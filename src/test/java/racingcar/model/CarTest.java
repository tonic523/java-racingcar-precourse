package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static racingcar.model.Car.*;

public class CarTest {
	@DisplayName("차의 이름 유효성 검사")
	@Test
	public void validateName() {
		assertThatThrownBy(() -> new Car("carName"))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining(String.format("자동차 이름의 길이는 %d ~ %d 여야 한다.",
				MIN_LENGTH_NAME, MAX_LENGTH_NAME));
	}

	@DisplayName("1칸씩 전진")
	@Test
	public void move() {
		Car car1 = new Car("car1");
		car1.move();
		assertThat(car1.getPosition()).isEqualTo(1);
	}
}
