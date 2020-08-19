package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Board;

public class BoardList {

  // 공통으로 사용할 값을 보관하는 변수는 스태틱 멤버(클래스 멤버)로 만든다.
  static final int DEFAULT_CAPACITY = 100;

  // 개별적으로 값을 보관해야 하는 변수는 인스턴스 멤버(non-static 멤버)로 만든다.
  Board[] list;
  int size = 0;

  public BoardList() {
    list = new Board[DEFAULT_CAPACITY];
  }

  public BoardList(int initialCapacity) {
    if (initialCapacity <= DEFAULT_CAPACITY) {
      list = new Board[DEFAULT_CAPACITY];
    } else {
      list = new Board[initialCapacity];
    }
  }

  public void add(Board board) {
    list[size++] = board;
  }

  public Board[] toArray() {
    Board[] arr = new Board[size];
    for (int i = 0; i < size; i++) {
      arr[i] = list[i];
    }
    return arr;
  }
}
