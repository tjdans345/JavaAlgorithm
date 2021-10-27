package com.company.algorithm.Find;

import java.util.Scanner;

public class MiddleFind {

    static int med3(int a, int b, int c) {
        if(a >= b) {
            if( b >= c) {
                return b;
            } else return Math.min(a, c);
        } else if(a > c) {
            return a;
        } else if(b > c ){
            return c;
        } else {
            return b;
        }
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("a의 값 :");
        int a = stdIn.nextInt();
        System.out.println("b의 값 :");
        int b = stdIn.nextInt();
        System.out.println("c의 값 :");
        int c = stdIn.nextInt();

        System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
    }

}
