package racingcar;

public class Car {

    private static String nameErrorMessage = "[ERROR] 이름은 1자 이상 5자 이하여야 합니다.";

    private final String name;
    private int position = 0;

    public Car(String name) {
        validateName(name);
        this.name = name;
    }

    // 추가 기능 구현
    private void validateName(String name) {
        if (name.isEmpty() || name.length() > 5) {
            throw new IllegalArgumentException(nameErrorMessage);
        }
    }
}
