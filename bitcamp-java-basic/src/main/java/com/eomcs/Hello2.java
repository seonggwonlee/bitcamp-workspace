class Hello2 {
    public static void main (String[] args) {
        System.out.println("com/eomcs/Hello2.java");
        System.out.println("Hello, World");

    }
}

// 주제 : 폴더를 구분하여 소스파일 관리하기
// 소스 파일을 단순히 폴더 구분하여 분리한다고 해서 관리할 수 있는 것이 아니다.
// 컴파일하면 단순히 한 폴더에 놓여진다.
// package 명령을 사용하여 클래스의 소속 지정 필요하다. / 소스 파일이 서로 다른 디렉토리에 있더라도 패키지 선언하지 않는다면 무소속 파일 즉, compile하면 계속 덮어쓰기 시행되어 하나의 .class파일만 남게된다.