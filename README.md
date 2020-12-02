# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 기능별 테스트 케이스
- [x] 덧셈
- [x] 뺄셈
- [x] 곱셈
- [x] 나눗셈
    - [x] 결과 값을 정수
    - [x] 0을 나눌 경우 ArithmeticException throw
- [x] 숫자 객체 비교 기능
- [x] 연산자 클래스 정의
    - [x] 연산자와 일치 하는 클래스 찾는 기능
    - [x] 연산자와 일치 하는 메소드 호출 기능
    - [x] 사칙연산 기호가 아닌 경우 IllegalArgumentException throw
- [x] 입력 받은 문자열에서 숫자와 연산자 분리
- [x] 입력 값이 null이거나 빈 공백 문자일 경우 IllegalArgumentException throw
- [x] 사칙 연산을 모두 포함하는 기능 구현


## Build
```
./gradlew build
```

## Run
```
java -jar build/libs/step1-calculator-1.0.0.jar
```
