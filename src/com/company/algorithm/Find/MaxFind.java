package com.company.algorithm.Find;

import java.util.Scanner;

public class MaxFind {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" 세 정수의 최댓값을 구합니다. ");
        System.out.println(" a의 값 : "); int a = scanner.nextInt();
        System.out.println(" b의 값 : "); int b = scanner.nextInt();
        System.out.println(" c의 값 : "); int c = scanner.nextInt();

        int max = a;
        if(b > max) max = b;
        if (c > max) max = c;

        System.out.println("최댓값은 " + max + "입니다.");

        System.out.println("최솟값 구하기를 시작하겠습니다. 계속하시려면 1, 그만하시려면 2를 입력해주세요");
        int continueResult = scanner.nextInt();
        if(continueResult == 1 ) {

            System.out.println(" 세 정수의 최소값을 구합니다. ");
            System.out.println(" A의 값 : "); int A = scanner.nextInt();
            System.out.println(" B의 값 : "); int B = scanner.nextInt();
            System.out.println(" C의 값 : "); int C = scanner.nextInt();

            int min = A;
            // 비교 기준을 앞에 ?
            if(min > B ) min = B;
            if (min > C ) min = C;

            System.out.println("최소값은 " + min + "입니다.");

        } else {
            System.out.println("프로그램이 종료 되었습니다.");
        }


    }

}
