package racingcar.view;

public class InputView {

	private static final String CARNAME_UI_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String COUNT_UI_MESSAGE = "시도할 회수는 몇회인가요?";

	public static void carNameUI() {
		System.out.println(CARNAME_UI_MESSAGE);
	}

	public static void countUI() {
		System.out.println(COUNT_UI_MESSAGE);
	}
}
