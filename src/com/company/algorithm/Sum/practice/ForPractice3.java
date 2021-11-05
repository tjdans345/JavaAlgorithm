package com.company.algorithm.Sum.practice;

import java.util.Scanner;

public class ForPractice3 {

    public static void main(String[] args) {
        int firstNum = 0;
        int secondNum = 0;

        Scanner sdtIn = new Scanner(System.in);
        System.out.println("두 정수 사이의 합을 구합니다.");
        System.out.println("첫 번째 정수를 입력해주세요.");
        firstNum = sdtIn.nextInt();
        System.out.println("두 번째 정수를 입력해주세요.");
        secondNum = sdtIn.nextInt();
        int result = sumOf(firstNum, secondNum);
        System.out.println("두 사이 정수의 합은 " + result + "입니다.");
    }

    static int sumOf(int a, int b) {
        int sum = 0;
        int cap = a-b;
        if (cap < 0 ) {
            cap  *= -1;
            for(int i=0; i<=cap; i++) {
                sum += a;
                a++;
            }
        } else {
            for(int i=0; i<=cap; i++) {
                sum += a;
                a--;
            }
        }

        return sum;
    }

}
