# 미션 - 자동차 경주 게임

---

## 📌 Wiki

---

- 📍 [미션 내용](https://github.com/tonic523/java-racingcar-precourse/wiki/%EB%AF%B8%EC%85%98-%EB%82%B4%EC%9A%A9)
- 🧐 [요구사항](https://github.com/tonic523/java-racingcar-precourse/wiki/%EC%9A%94%EA%B5%AC%EC%82%AC%ED%95%AD)
- 📝 [개발 일지](https://github.com/tonic523/java-racingcar-precourse/wiki/%EA%B0%9C%EB%B0%9C-%EC%9D%BC%EC%A7%80)

## 🙉 프로젝트 소개

---

- 자동차 경주 게임을 구현한 프로젝트입니다.
- 자동차들의 이름과 시도할 회수를 입력하면 자동차 게임이 진행됩니다.
- 시도한 회수 만큼 자동차 경주는 진행되고 시도마다 현황판을 알려줍니다.
- 매 회당 자동차들은 랜덤 값(0~9)을 뽑고, 그 값이 4이상일 경우에만 전진합니다.
- 모든 회수가 끝나면 전진한 거리에 따라 우승한 자동차들이 정해지고, 이름이 출력됩니다. (우승자는 다수일 수 있습니다)

## 🛠 프로그램 기능 목록

---

> 자동차들의 이름을 입력받는다.

- 각 자동차들의 이름은 쉼표(,)로 구분하여 입력받는다. `pobi, woni, jun`
- [예외] 쉼표(,) 구분자가 없을 때 (자동차는 최소 2대 이상 참가한다는 가정)
- [예외] 자동차의 이름이 "" 또는 5자를 초과할 때

> 이동 회수를 입력받는다.

- [예외] 양수가 아닌 값이 들어왔을 때 (0, -1, "abcd")

> 이동 회수만큼 모든 자동차는 조건에 따라 전진하거나 멈춘다.

- [조건] 각 자동차는 0 ~ 9 사이의 랜덤 값을 받고 random값이 4 이상을 경우에만 한 칸씩 움직인다.

> 모든 회수를 마치면 우승자를 알려준다.

- 우승자는 다수일 수 있다.

## ⭐️ 구현할 기능 목록

---

### Model

> Car : 이름과 위치를 가지며 자동차 역할을 한다.

- 이름과 위치를 가진다.
- [예외] 생성 시 1자~5자가 아닌 이름을 입력받으면 예외 발생
- 4 이상인 값을 받으면 1칸씩 움직인다.

> Game : 자동차들의 전진을 통제한다.

- 참가한 자동차들에게 랜덤 값을 준다.
- 참가한 자동차들의 현재 상황을 알려준다.
- 현재 우승자인 자동차들을 알려준다.
- 거리를 기준으로 오름차순으로 자동차들을 정렬한다.

### View

> InputView

- 이름 입력, 회수 입력 UI

> PlayView

- 실행 결과 UI
- 자동차들의 현황판 UI

> WinnerView

- 우승자 UI

### Controller

> InputController

- 입력값을 ,로 구분하여 Car 리스트로 변환
- [예외] 잘못된 값을 입력할 시 에러 메시지 출력
- [예외] 회수를 입력받을 때 양수가 아니면 에러 메시지 출력

> PlayController

- Car 리스트를 Game에 전달
- Game을 회수만큼 실행시키고 현황판을 출력한다.

> WinnerController

- Game에서 우승자 리스트를 받아 출력한다.
