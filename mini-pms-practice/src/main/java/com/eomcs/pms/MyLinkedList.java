package com.eomcs.pms;

public class MyLinkedList {
  private Node first;
  private Node last;
  private int size; // 목록의 크기


static class Node {
  Object value;
  Node next;

  public Node() {}

  public Node(Object value) {
    this.value = value;
  }
}
 // 값을 담을 노드 클래스(목록에서 각 항목의 값을 보관하는 객체의 역할 수행)

  public boolean add(Object e) {
    Node node = new Node();
    node.value = e;

    if (first == null) {
      first = node;
    } else {
      last.next = node;
      }
    last = node;

    size++;

    return true;
  }

  public Object get(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("유효하지 않은 인덱스 값입니다.");
    }

    Node cursor = this.first;
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }

  public void add(int index, Object element) {
    if (index < 0 || index > this.size) {
      throw new IndexOutOfBoundsException("유효하지 않은 인덱스 값입니다.");
    }

    Node node = new Node(element);

    size++;

    if (index == 0) {
      node.next = first;
      first = node;
      return;
    }

    Node cursor = this.first;
    for (int i = 1; i <= index - 1; i++) {
      cursor = cursor.next;
    }

    node.next = cursor.next;
    cursor.next = node;

    if (node.next == null) {
      last = node;
    }
  }

  public Object remove(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("유효하지 않은 인덱스 값입니다.");
    }
    size--;

    if (index == 0) {
      Node old = first;
      first = old.next;
      old.next = null;
      return old.value;
    }

    Node cursor = this.first;
    for (int i = 1; i <= index - 1; i++) {
      cursor = cursor.next;
    }

    Node old = cursor.next;
    cursor.next = old.next;
    old.next = null;

    if (cursor.next == null) {
      last = cursor;
    }
    return old.value;
  }

  public Object set(int index, Object element) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("유효하지 않은 인덱스 값입니다.");
    }

    Node cursor = this.first;
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }

    Object old = cursor.value;
    cursor.value = element;

    return old;
  }

  public Object[] toArray() {
    Object[] arr = new Object[this.size];

    int i = 0;
    Node cursor = first;

    while (cursor != null) {
      arr[i++] = cursor.value;
      cursor = cursor.next;
    }
    return arr;
  }

  public int size() {
    return this.size;
  }
}