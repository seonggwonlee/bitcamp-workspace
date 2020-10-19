package com.eomcs.GodofJava;

public class VariableType {

    int instanceVariable;
    static int classVariable;

    public void method (int parameterVariable) {

      if (true) {
        int localVariable;
      }

      if (true) {
        int localVariable; // 위 localVariable과는 다른 중괄호이므로 다른 변수로 취급한다.
      }
    }

  public static void main(String[] args) {
    int localVariable;
  }
}
