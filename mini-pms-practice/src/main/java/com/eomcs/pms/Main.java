package com.eomcs.pms;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner keyScan = new Scanner(System.in);
                        
        // System.out.print(A);
        int A = keyScan.nextInt();
        
        // System.out.print(B);
        int B = keyScan.nextInt();
        
        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);

    }
}
