package com.eomcs.algorithm.data_structure.queue;

public class MyQueueTest {

  public static void main(String[] args) {
    MyQueue queue = new MyQueue();

    queue.offer("aaa");
    queue.offer("bbb");
    queue.offer("ccc");
    System.out.println("==> " + queue.peek()); // aaa
    queue.offer("ddd");
    queue.offer("eee");

    print(queue);

    System.out.println(queue.poll()); // 꺼낸다는 것은 remove에 해당되기 때문에 없어진다.
    System.out.println(queue.poll());
    System.out.println("==> " + queue.peek()); // ccc
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
  }

  static void print(MyQueue queue) {
    for (int i = 0; i < queue.size(); i++) {
      System.out.print(queue.get(i) + ",");
    }
    System.out.println();
  }
}
