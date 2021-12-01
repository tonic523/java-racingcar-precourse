package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameTest {
	@DisplayName("자동차 참가")
	@Test
	void participate() {
		Game game = new Game();
		Car car = new Car("car");
		game.participate(car);
		assertThat(game.getCars().get(0)).isEqualTo(car);
	}
}
