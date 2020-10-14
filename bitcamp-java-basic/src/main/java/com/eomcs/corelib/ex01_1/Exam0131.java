package com.eomcs.corelib.ex01_1;

public class Exam0131 {

  public static void main(String[] args) {
    My obj1 = new My();

    obj1.name = "홍길동";
    obj1.age = 20;
    obj1.tel = "1111-1111";
    obj1.email = "hong@test.com";
    obj1.gender = 1;
    obj1.working = false;

    My obj2 = new My();
    obj2.name = "홍길동";
    obj2.age = 20;
    obj2.tel = "1111-1111";
    obj2.email = "hong@test.com";
    obj2.gender = 1;
    obj2.working = false;

    System.out.println(obj1 == obj2);
    System.out.println(obj1.equals(obj2));
  }
  // Object에서 상속받은 equals를 그대로 사용한다면 인스턴스를 비교한다.
  // 그 내용물을 비교하고 싶다면 재정의(오버라이딩)하여 사용하면 된다.


  static class My {
    String name;
    int age;
    String tel;
    String email;
    int gender;
    boolean working;

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + age;
      result = prime * result + ((email == null) ? 0 : email.hashCode());
      result = prime * result + gender;
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      result = prime * result + ((tel == null) ? 0 : tel.hashCode());
      result = prime * result + (working ? 1231 : 1237);
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
      My other = (My) obj;
      if (age != other.age)
        return false;
      if (email == null) {
        if (other.email != null)
          return false;
      } else if (!email.equals(other.email))
        return false;
      if (gender != other.gender)
        return false;
      if (name == null) {
        if (other.name != null)
          return false;
      } else if (!name.equals(other.name))
        return false;
      if (tel == null) {
        if (other.tel != null)
          return false;
      } else if (!tel.equals(other.tel))
        return false;
      if (working != other.working)
        return false;
      return true;
    }
  }
}