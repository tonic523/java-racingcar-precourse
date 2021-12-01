package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.utils.Validate;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행
        // 경주할 자동차 이름 입력 및 게임 참가
        Game game = new Game();
        View.inputCarName();
        String[] carNameList = Console.readLine().split(",");
        for (String carName : carNameList) {
            game.participate(new Car(carName));
        }
        // 시도할 회수 입력
        View.inputCount();
        String playCount = Console.readLine();
        Validate.isNumber(playCount);
        // 실행 결과 현황판
        View.result();
        for (int play = 0; play < Integer.parseInt(playCount); play++) {
            game.play();
            View.resultBoard(game.getCars());
        }
        // 우승자 출력
        View.winner(game.winners());
    }
}
