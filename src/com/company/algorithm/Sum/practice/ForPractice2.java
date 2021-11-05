package com.company.algorithm.Sum.practice;

import java.util.Scanner;

public class ForPractice2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("1부터 입력한 수까지의 합을 구합니다.");
        System.out.println("값을 입력해주세요.");
        int n = stdIn.nextInt();

        int sum = 0;
        String result = "";

        sum = (int) ((1+n) * ((double)n/2));

        System.out.println("입력하신 수까지의 합은 " + sum + " 입니다.");


    }

}
