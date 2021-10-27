package com.company.algorithm.Sum;

import java.util.Scanner;

public class SumPractice {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 입력한 수까지의 합을 구합니다.");
        System.out.println("값을 입력해주세요.");
        int n = stdIn.nextInt();

        int sum = 0; // 합
        int i = 1;

        while ( i <= n) {
            sum += i;
            i++;
        }
        System.out.println( " 1부터 " + n + "까지의 합은 " + sum + "입니다.");
        System.out.println( " i 값 :  " + i);

    }

}
