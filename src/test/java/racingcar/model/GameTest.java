package racingcar.model;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class GameTest {
	@DisplayName("자동차들의 참가 및 반환")
	@Test
	void getCars() {
		List<Car> cars = Arrays.asList(
			new Car("car1"),
			new Car("car2"),
			new Car("car3")
		);
		Game game = new Game();
		game.participate(cars);
		assertThat(game.getCars().containsAll(cars)).isTrue();
	}
}
