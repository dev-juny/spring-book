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

- 템플릿 메소드 패턴, 팩토리 메소드 패턴으로 적용을 하면 상속으로 구현을 해야하기 때문에, 
  UserDao에 다른 상속이 필요하게 되면 할 수가 없어 Pass
  
- SimpleConnectionMaker 인터페이스를 신규로 만들어 UserDao에서 implements를 하면
  기능적으로 문제는 없지만 또다시 처음으로 돌아간다. 
  
- 명확한 해결방법은 UserDaoTest라는 Client Class를 신규로 생성하여 DB Connection을 할 수 있도록 한다.

1.7.2 런타임 의존관계 설정

1.7.3 의존관계 검색과 주입

1.7.4 의존관계 주입의 응용

1.7.5 메소드를 이용한 의존관계 주입

1.8
