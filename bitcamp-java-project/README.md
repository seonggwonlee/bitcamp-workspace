# 14 - UI 처리하는 코드와 데이터를 처리하는 코드를 분리하기

객체지향 프로그래밍을 할 때 다음 두 가지를 명심해야한다.
- 1) Low Coupling 
- 2) High Cohesion 

1) **관계도 낮추기(Low Coupling)**란 ?
- 한 클래스가 많은 클래스에 의존하는 구조로 작성하면 의존 클래스가 변경될 때마다 영향을 받기 때문에 유지보수에 좋지 않다.
- 따라서 가능한 의존하는 클래스의 접점을 줄이는 구조로 만드는 것이 좋다.
(관계도 낮추기 => 의존 클래스 변경 둔감 => 코드 변경이 줄어듦)

2) **응집력 강화(High Cohesion)**란?
- 한 클래스가 너무 다양한 역할을 수행하면 클래스 코드가 거대해지고 복잡해지기 때문에 변경 사항이 잦아져 유지보수에 적합하지 않다.
- 따라서 가능한 한 클래스가 한 개의 역할만 수행하게 만드는 것이 유지보수 측면에서 용이하다.
- 역할을 쪼개게 되면 해당 클래스를 다른 프로젝트에서 재사용하기 용이하다.
(클래스 분리 => 교체가 용이하고 재사용성 향상)

이번 훈련의 목표는 **응집력 강화**를 연습하는 것이다.
기존의 XxxHandler 클래스는 사용자에게 출력하고 사용자의 입력을 받는, 즉 사용자와 소통하는 역할을 수행할 뿐만 아니라 사용자가 입력한 데이터를 관리하는 일도 수행한다.
이번 훈련에서는 XxxHandler의 역할을 더 작게 쪼개어 전문화 시킬 것이다. 즉 사용자의 소통을 담당하는 **UI역할**클래스와 데이터 처리를 담당하는 **DAO(Data Access Object)역할** 클래스로 분리할 것이다.
위와 같이 분리하게 된다면 추후 데이터 처리 부분을 다른 클래스로 교체하기 용이해진다. 
예를 들면 지금은 데이터를 배열에 보관하지만 나중에는 파일이나 DBMS에 보관하는 클래스로 교체하기가 쉬워진다.
또한 지금은 CLI(Command Line Interface)방식으로 UI를 처리하고있지만 나중에는 웹으로 처리하는 클래스로 교체하기 편하다.

## 훈련 목표

- 캡슐화 기법을 이용하여 데이터 처리 코드를 별개의 클래스로 분리한다.
- 배열 복제를 통해 배열의 크기를 늘린다.
- 역할에 따라 클래스를 분리하는 방법과 이점을 이해한다.  

## 훈련 내용

- XxxHandler 클래스를 UI 처리와 데이터 처리 역할자로 분리한다.

## 실습

### 1) BoardHandler에서 데이터 처리 코드를 분리하라.

- BoardList.java
    - `BoardHandler`에서 데이터 처리 코드를 분리하여 `BoardList`클래스로 정의한다.
    - `BoardList`의 기본 생성자와 배열의 초기 크기를 설정하는 생성자를 정의한다.
    - `BoardList`에서 데이터를 배열로 리턴하는 toArray() 메서드를 작성한다.
    - `BoardList`에 Board 객체를 등록하는 Add()를 정의한다.
    - `BoardList`에 기본 생성자와 배열의 초기 크기를 설정하는 생성자를 정의한다.  

  ##### 작업 파일
  - com.eomcs.pms.handler.BoardList 클래스 추가 
    - 백업 : BoardList.java.01
  - com.eomcs.pms.handler.BoardHandler 클래스 변경
    - 백업 : BoardList.java.01

### 2) Board 클래스를 패키지 멤버 클래스로 전환한다.

- 여러 클래스에서 공유하는 클래스는 중첩 클래스 정의하기 보다는 패키지 멤버 클래스로 정의하면 관리하기 더 쉽다.

- BoardList 클래스에서 Board 클래스를 분리하여 패키지 멤버 클래스로 만든다.

  ##### 작업 파일
  - com.eomcs.pms.domain 패키지 생성 
    - Board나 Member처럼 데이터 타입 역할을 하는 클래스를 **도메인(Domain)**클래스라고 부른다.
  - 도메인 클래스를 저장할 패키지를 따로 생성한다.
  - com.eomcs.pms.domain.Board 클래스 생성

### 3) MemberHandler 클래스에서 데이터 처리 코드를 별도의 클래스로 분리한다. 

- BoardHandler와 마찬가지로 데이터 처리 역할을 별도의 클래스로 분리한다.

- MemberList.java
    - `MemberHandler`에서 데이터 처리 코드를 이 클래스로 옮긴다.
    - 회원 데이터 배열을 리턴하는 toArray() 메서드를 정의한다.
    - 회원 데이터를 저장하는 add() 메서드를 정의한다.
    - 기본 생성자와 배열의 초기 크기를 설정하는 생성자를 정의한다.  
- MemberHandler.java
    - `MemberList` 클래스를 사용하여 데이터를 처리한다.

### 작업3) BoardHandler에서 데이터 처리 코드를 분리하라.

- BoardList.java
    - `BoardHandler`에서 데이터 처리 코드를 이 클래스로 옮긴다.
    - 게시물 데이터 배열을 리턴하는 toArray() 메서드를 정의한다.
    - 게시물 데이터를 저장하는 add() 메서드를 정의한다.
    - 기본 생성자와 배열의 초기 크기를 설정하는 생성자를 정의한다.  
- BoardHandler.java
    - `BoardList` 클래스를 사용하여 데이터를 처리한다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/handler/LessonList.java 추가
- src/main/java/com/eomcs/lms/handler/MemberList.java 추가
- src/main/java/com/eomcs/lms/handler/BoardList.java 추가
- src/main/java/com/eomcs/lms/handler/LessonHandler.java 변경
- src/main/java/com/eomcs/lms/handler/MemberHandler.java 변경
- src/main/java/com/eomcs/lms/handler/BoardHandler.java 변경