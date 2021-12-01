package racingcar;

public class Car {

	private static String nameErrorMessage = "[ERROR] 이름은 1자 이상 5자 이하여야 합니다.";
	private static int MOVABLE_MIN_VALUE = 4;

	private final String name;
	private int position = 0;

	public Car(String name) {
		validateName(name);
		this.name = name;
	}

    public void move(int moveValue) {
        if (moveValue >= MOVABLE_MIN_VALUE) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

	private void validateName(String name) {
		if (name.isEmpty() || name.length() > 5) {
			throw new IllegalArgumentException(nameErrorMessage);
		}
	}
}