package com.company.algorithm.Sum.practice;

import java.util.Scanner;

public class ForPractice {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("1부터 입력한 수까지의 합을 구합니다.");
        System.out.println("값을 입력해주세요.");
        int n = stdIn.nextInt();

        int sum = 0;
        String result = "";

        for(int i=1; i<=n; i++) {
            if(i == 1) {
                result += i;
                System.out.println(result);
            } else {
                sum += i;
                result += i + " + ";
                if( i == n) {
                    result += " = " + sum;
                    System.out.println(result);
                }
            }
        }


    }

}
