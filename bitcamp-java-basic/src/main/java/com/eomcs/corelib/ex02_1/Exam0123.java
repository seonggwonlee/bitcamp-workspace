package com.eomcs.corelib.ex02_1;

public class Exam0123 {
  static class Member {
    String name;
    int age;

    public Member (String name, int age) {
      this.name = name;
      this.age = age;

    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + age;
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      return result;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Member other = (Member) obj;
      if (age != other.age)
        return false;
      if (name == null) {
        if (other.name != null)
          return false;
      } else if (!name.equals(other.name))
        return false;
      return true;
    }
  }

  public static void main(String[] args) {
    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("홍길동", 20);

    System.out.println(m1 == m2);
    System.out.println(m1.equals(m2));
    // Member 클래스는 equal()도구를 오버라이딩 하지 않아 Object에서 직접 상속 받기 때문에
    // 두 변수를 비교시 인스턴스가 같은지 확인한다. => false출력
    // 그러나 오버라이딩시 내용물을 확인하기 때문에 true 출력
  }
}
