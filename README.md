# spring-book

스프링 책 공부 
토비의 스프링 3.1

1.1 초난감 DAO

- User Object 생성 (id, name, password)
- UserDAO 생성 ( add(), get() )
* DAO : (Data Access Object)


기능적으론 문제없지만 관심사의 분리가 필요하다. 왜?
add() 메소드와 get() 메소드 내의 DB connection 이 중복으로 사용된다.
만약, 100개 또는 1000개 이상의 메소드에서 DB connetion 정보를 동일하게 사용했는데
Connection 정보를 바꾸게 되면 어떻게 될까? - 생각만해도 끔찍히다.

해당 해결방안으로 떠오르는 방안 중 하나가 **템플릿 메소드 패턴**이다

Connection 이라는 관심사를 분리하여 하나의 Super Class를 정의하고
UsesrDao에서 Connection Class를 상속 받아 재정의 하는 방법이 있다.

