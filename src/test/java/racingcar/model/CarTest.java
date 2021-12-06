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

	@DisplayName("1칸씩 전진")
	@Test
	public void move() {
		Car car1 = new Car("car1");
		car1.move();
		assertThat(car1.getPosition()).isEqualTo(1);
	}
}
