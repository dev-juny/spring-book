# spring-book

스프링 책 공부 
토비의 스프링 3.1

1.1 초난감 DAO

- User Object 생성 (id, name, password)
- UserDAO 생성 ( add(), get() )
* DAO : (Data Access Object)


기능적으론 문제없지만 관심사의 분리가 필요함
왜?

add() 메소드와 get() 메소드 내의 DB connection 이 중복으로 사용됨
그럼 100개 아니, 1000개 이상일 때, DB connetion 정보를 바꾸게 되면? - 생각만 해도 끔찍

템플릿 메소드 패턴, 팩토리 메소드 패턴은 같은 듯 다른거 같음 (정확하게 알아보려고 함)
