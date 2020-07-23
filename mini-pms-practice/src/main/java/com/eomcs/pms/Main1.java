package com.eomcs.pms;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("A 입력 : ");
        int A = keyScan.nextInt();
        System.out.print("B 입력 : ");
        int B = keyScan.nextInt();

    if (A > 0 && B < 10) {
        System.out.print("결과 : ");
        System.out.println(A + B);
    }
    else {                
            
            System.out.println("다시 시도하십시오");
    }

    }
}
