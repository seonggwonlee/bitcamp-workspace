package com.eomcs.pms;

public class App {

  public static void main(String[] args) {
    
    // 콘솔에서 사용자의 입력을 처리하는 도구를 준비한다.
    // ==> 키보드 input stream : System.in
    // ==> input stream에서 data를 읽어 적절한 Type으로 Return하는 도구 : Scanner
    java.util.Scanner KeyInput = new java.util.Scanner(System.in); // java.util -> util에 있는 Scanner 도구를 사용한다.
    // 자바에서 도구는 Remote없이 단독으로 사용 불가능, 따라서 KeyInput 변수를 통해 Remote기능을 하게한다.
//    new java.io.BufferedInputStream(System.in);
//    new java.io.DataInputStream(System.in);
    
    System.out.println("[회원]");
    
    System.out.print("번호? ");
    // int no = KeyInput.nextLine(); nextLine은 문자열만 리턴 
    int no = KeyInput.nextInt(); 
    KeyInput.nextLine(); // nextInt는 입력 값 중 숫자만 뽑아가고 Enter값은 버리지 않고 메모리에 남겨둔다. 
    //따라서 숫자 뒤에 남아있는 CR/LF 값 읽기위해 추가 선언
            
    System.out.print("이름? ");
    String name = KeyInput.nextLine();
    
    System.out.print("이메일? ");
    String email = KeyInput.nextLine();
    
    System.out.print("암호? ");
    String password = KeyInput.nextLine();
    
    System.out.print("사진? ");
    String photo = KeyInput.nextLine();
    
    System.out.print("전화? ");
    String call = KeyInput.nextLine();
    
    long currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00에서 부터 지금까지 경과된 밀리초 리턴.
    java.sql.Date now = new java.sql.Date(currentMillis);
        
    KeyInput.close();
    
    System.out.println("-------------------------------");
    System.out.printf("번호: %d\n", no);
    System.out.printf("이름: %s\n", name);
    System.out.printf("이메일: %s\n", email);
    System.out.printf("암호: %s\n", password);
    System.out.printf("사진: %s\n", photo);
    System.out.printf("전화: %s\n", call);
    System.out.printf("가입일: %s\n", now.toString());
    
    
    
  }
}
