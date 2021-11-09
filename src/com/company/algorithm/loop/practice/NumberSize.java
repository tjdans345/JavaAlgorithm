package com.company.algorithm.loop.practice;

import java.util.Scanner;

public class NumberSize {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int value;
        int length;
        do {
            System.out.println("입력하신 수의 자리수를 구합니다 (0이상의 양의정수만 입력해 주세요.)");
            value = stdIn.nextInt();
        } while (value <= 0);

        length = (int)(Math.log(value)+1);

        System.out.println("입력하신 양의 정수의 자리수는 " + length + "입니다.");

    }







}
