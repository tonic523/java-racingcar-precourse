package racingcar.controller;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import racingcar.model.Car;

import static org.assertj.core.api.Assertions.*;

public class InputControllerTest {
	@DisplayName("자동차 이름 입력")
	@Nested
	class InputCarName {
		@DisplayName("성공")
		@ParameterizedTest
		@ValueSource(strings = {"car1,car2", "car12,c,car1"})
		void success(String input) {
			List<Car> cars = InputController.requestCarName(input);
			String[] carNames = input.split(",");
			for (int i = 0; i < carNames.length; i++) {
				assertThat(carNames[i]).isEqualTo(cars.get(i).getName());
			}
		}
	}

	@DisplayName("회수 입력")
	@Nested
	class InputCount {
		@DisplayName("성공")
		@ParameterizedTest
		@ValueSource(strings = {"1", "2", "10"})
		void success(String input) {
			assertThat(InputController.requestCount(input))
				.isEqualTo(Integer.parseInt(input));
		}

		@DisplayName("실패")
		@ParameterizedTest
		@ValueSource(strings = {"0", "a", "1a", "-1"})
		void fail(String input) {
			assertThatThrownBy(() -> InputController.requestCount(input))
				.isInstanceOf(IllegalArgumentException.class);
		}
	}
}
