// java.util.ArrayList와 비교
package com.eomcs.corelib.ex03;

import java.util.ArrayList;

public class Exam0120 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList(); // 인스턴스 '주소'를 보관, 조회, 삭제 등을 도와준다
    list.add("aaa"); // aaa,
    list.add("bbb"); // aaa, bbb,
    list.add("ccc"); // aaa, bbb, ccc,
    list.add("ddd"); // aaa, bbb, ccc, ddd,

    print(list);

    list.remove(2); // aaa, bbb, ddd, ccc는 주소를 잃어버렸기 때문에 가비지가 된다.
    print(list);

    list.remove(0); // bbb, ddd,
    print(list);

    //  유효한 인덱스가 아니면 예외 발생시킨다!
    //  list.remove(4); // 실행 오류!
    //  print(list);

    list.add(1, "xxx"); // bbb, xxx, ddd,
    list.add(1, "yyy"); // bbb, yyy, xxx, ddd
    list.add(0, "zzz"); // zzz, bbb, yyy, xxx, ddd
    print(list);

    // 삽입할 인덱스가 배열의 크기를 가리킬 경우, 맨 끝에 추가한다.
    // 맨 끝을 초과하거나 음수 값을 가리킬 경우 오류 출력
    list.add(5, "ttt"); // zzz, bbb, yyy, xxx, ddd, ttt
    print(list);

    // 해당 위치에 주소를 변경한다.
    list.set(1, "aaa"); // zzz, aaa, yyy, xxx, ddd, ttt
    print(list);

    list.add("ccc"); // zzz, aaa, yyy, xxx, ddd, ttt, ccc
    print(list);

    list.add("eee"); // zzz, aaa, yyy, xxx, ddd, ttt, ccc, eee
    print(list);
  }

  static void print(ArrayList list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + ", ");
    }
    System.out.println();
  }
}


