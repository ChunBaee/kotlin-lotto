동작 구분
-------

1. 로또 구입 금액을 입력받는다.
2. 1번에서 입력받은 금액으로 로또 번호 6개가 담긴 배열을 만들어 출력한다.
3. 로또 당첨 번호를 입력받는다.
4. 보너스 번호를 입력받는다.
5. 3,4번에서 입력받은 숫자들과 2번에서 만든 로또 배열을 비교하여 결과를 출력한다.


기능 목록
------

1. 로또를 구입할 금액을 입력받는다.
2. 1번에서 입력받은 금액이 1000원으로 나누어 떨어지는지, 숫자만 포함되어있는지 검사 후 예외처리한다.
3. 1번에서 받은 금액으로 로또를 몇 장 살 수 있는지 계산한다.
4. 3번에서 계산한 결과값만큼 랜덤한 수를 6개 담는 배열을 생성한다.
5. 4번의 배열에 중복된 숫자가 담겨져있지 않은지 검사 후 예외처리한다.
6. 만약 5번의 과정에서 예외가 있다면, 다시 중복되지 않은 수를 추가한다.
7. 유저에게 당첨번호 , 기준으로 6개를 입력받는다.
8. 7번에서 받은 숫자들이 1~45 안에 있는지, 6개가 맞는지, 문자가 포함되어있지 않은지 검사 후 예외처리한다.
9. 보너스 번호를 입력받는다.
10. 입력받은 보너스 번호가 1~45안에 있는지, 6번의 숫자들과 겹치지는 않는지, 문자가 포함되어있지 않은지 검사 후 예외처리한다.
11. 이제 로또 배열을 하나씩 돌면서 유저가 입력한 당첨번호와 보너스 번호를 비교한다.
12. 결과값을 유저에게 출력한다.
