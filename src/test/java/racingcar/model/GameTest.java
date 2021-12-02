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

	@DisplayName("순위 정렬")
	@Test
	void rankInOrder() {
		List<Car> cars = game.getCars();
		Car expected = cars.get(2);
		expected.moveForward(5);

		game.rankInOrder();
		Car actual = game.getCars().get(0);
		assertThat(actual.getName()).isEqualTo(expected.getName());
	}

	@DisplayName("우승한 자동차들")
	@Test
	void winners() {
		List<Car> cars = game.getCars();
		Car winner1 = cars.get(1);
		Car winner2 = cars.get(2);
		winner1.moveForward(5);
		winner2.moveForward(5);
		List<Car> expected = Arrays.asList(winner1, winner2);
		assertThat(game.winners().containsAll(expected)).isTrue();
	}
}
