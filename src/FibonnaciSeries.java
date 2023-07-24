package com.logicalprolems;

import java.util.Scanner;

public class FibonnaciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int term, a = 0, b = 1, c;
        System.out.println("Enter the range");
        term = sc.nextInt();
        for (int i = 1; i <= term; i++) {
            System.out.print(a+" ");
            c = a + b;
            a = b;
            b = c;
        }


    }
}
