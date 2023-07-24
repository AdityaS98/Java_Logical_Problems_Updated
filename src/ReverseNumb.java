package com.logicalprolems;

import java.util.Scanner;

public class ReverseNumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, reverse = 0;
        number = sc.nextInt();
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
