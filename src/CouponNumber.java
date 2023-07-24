package com.logicalprolems;

import java.util.Scanner;

public class CouponNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coupon number");

        int coupon = sc.nextInt();
        int count = 0, random = 0;

        while (coupon != random) {
            random = (int) (Math.random() * 100 + 1);
            count++;
        }
        System.out.println(count + " number needed");
    }
}
