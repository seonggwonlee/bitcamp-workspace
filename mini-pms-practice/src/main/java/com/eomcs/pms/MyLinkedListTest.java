package com.eomcs.pms;

public class MyLinkedListTest {
  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();

    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");

    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));

    System.out.println("-----------");

    print(list);

    System.out.println("-----------");

    list.add(2, "eee");
    list.add(0, "fff");
    list.add(6, "ggg");
    list.add("hhh");
    print(list);

    System.out.println("-----------");

    System.out.println(list.remove(4));
    print(list);
    System.out.println(list.remove(0));
    print(list);
    System.out.println(list.remove(5));
    print(list);

    System.out.println(list.set(2, "xxx"));
    print(list);
    System.out.println(list.set(0, "sss"));
    print(list);
    System.out.println(list.set(4, "ttt"));
    print(list);

    System.out.println("-----------");

    print2(list.toArray());
  }

  static void print(MyLinkedList list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + ", ");
    }
    System.out.println();
  }

  static void print2(Object[] arr) {
    for (Object obj : arr) {
      System.out.print(obj + ",");
    }
    System.out.println();
  }
}

