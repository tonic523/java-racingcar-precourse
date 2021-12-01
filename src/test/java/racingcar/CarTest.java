package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

	@DisplayName("이름의 유효성 검사")
	@Test
	void validateName() {
		assertThatThrownBy(() -> new Car("aaaaaa"))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("[ERROR] 이름은 1자 이상 5자 이하여야 합니다.");
	}

	@DisplayName("전진")
	@Test
	void move() {
		Car car = new Car("car");
		car.move(4);
		assertThat(car.getPosition()).isEqualTo(1);
		car.move(3);
		assertThat(car.getPosition()).isEqualTo(1);
	}
}
