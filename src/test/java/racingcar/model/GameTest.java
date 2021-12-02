package racingcar.model;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class GameTest {

	static Game game = new Game();

	@BeforeEach
	void setUp() {
		List<Car> cars = Arrays.asList(
			new Car("car1"),
			new Car("car2"),
			new Car("car3")
		);
		game.participate(cars);
	}

	@DisplayName("자동차들의 참가 및 반환")
	@Test
	void getCars() {
		List<Car> expected = Arrays.asList(
			new Car("car1"),
			new Car("car2"),
			new Car("car3")
		);
		assertThat(game.getCars().containsAll(expected)).isTrue();
	}

	@DisplayName("경주 진행")
	@Test
	void play() {
		Movable movable = () -> 5;
		game.play(movable);
		List<Car> cars = game.getCars();
		for (Car car : cars) {
			assertThat(car.getPosition()).isEqualTo(1);
		}
	}
}
