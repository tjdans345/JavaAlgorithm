package com.company.algorithm.Find.practice;

import java.util.Scanner;

public class MinFind {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" 세 정수의 최소값을 구합니다. ");
        System.out.println(" A의 값 : "); int A = scanner.nextInt();
        System.out.println(" B의 값 : "); int B = scanner.nextInt();
        System.out.println(" C의 값 : "); int C = scanner.nextInt();
        System.out.println(" D의 값 : "); int D = scanner.nextInt();

        int min = A;
        // 비교 기준을 앞에 ?
        if(min > B ) min = B;
        if (min > C ) min = C;
        if (min > D ) min = D;

        System.out.println("최소값은 " + min + "입니다.");

    }

}
