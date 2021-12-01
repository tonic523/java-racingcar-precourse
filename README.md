# 미션 - 자동차 경주 게임

## 📌 Wiki
- 📍 [미션 내용](https://github.com/tonic523/java-racingcar-precourse/wiki/%EB%AF%B8%EC%85%98-%EB%82%B4%EC%9A%A9)
- 🧐 [요구사항](https://github.com/tonic523/java-racingcar-precourse/wiki/%EC%9A%94%EA%B5%AC%EC%82%AC%ED%95%AD)
- 📝 [개발 일지](https://github.com/tonic523/java-racingcar-precourse/wiki/%EA%B0%9C%EB%B0%9C-%EC%9D%BC%EC%A7%80)

## 👣 스토리보드

1. 사용자는 참가할 자동차의 이름들을 쉼표(,)를 기준으로 입력한다.
   - [예외] , 로 구분된 이름은 5자 이하여야 한다.
   - [예외] 구분된 이름은 빈칸이면 안된다.

2. 사용자는 몇 번의 이동을 할 것인지 입력한다.
   - [예외] 회수 입력은 숫자여야 한다.
3. 이동을 할 때마다 자동차들의 현황판을 보여준다.
4. 이동이 끝나면 최종 우승자를 출력한다.

[예외] 예외 상황 시 에러 문구를 출력한다.

## ⭐️ 구현할 기능 목록
> Car :이름과 위치를 가지고 움직인다.
-[x] 이름의 유효성 검사
-[ ] 들어온 값이 4이상 일 때 움직인다.
-[x] 현재 위치를 알려준다.

> Validate :입력값이 숫자인지 검사
-[x] 입력값이 숫자인지 검사

> Game :자동차들의 경주를 진행한다.
-[x] 자동차를 참가시킨다.
-[ ] 자동차들의 경주를 진행한다.
-[ ] 가장 많이 움직인 자동차를 알려준다.