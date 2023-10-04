## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```


## 기능 요구사항
 * 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
   * [x] 이름을 필드로 하는 자동차 개체 구현
   * [x] 자동차 객체를 생성할 때 글자수에 대한 검증 구현
 * 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
   * [ ] 자동차의 전진을 기록하기 위한 Position 객체 구현
   * [ ] 자동차의 이름과 거리를 출력하는 로직 생성
 * 자동차 이름은 쉼표(,)를 기준으로 구분한다.
   * [ ] , 를 기준으로 문자열을 구분하는 로직 생성
 * 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
   * [ ] Random을 이용해 0에서 9 사이의 숫자 입력다는 로직 생성
   * [ ] 입력받은 값이 4 이상일 경우 Position의 값 1 증가
 * 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.
   * [ ] 각 자동차들 가장 멀리 간 자동차의 거리 확인
   * [ ] 중복이 가능하므로 가장 멀리 간 자동차들을 리스트로 출력