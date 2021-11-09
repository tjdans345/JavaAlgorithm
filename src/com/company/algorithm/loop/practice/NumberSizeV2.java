package com.company.algorithm.loop.practice;

import java.util.Scanner;

public class NumberSizeV2 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int length = 0;
        int value;

        do {
            System.out.println("0이상의 양의정수를 입력해주세요. 자리수가 반환됩니다.");
            value = stdIn.nextInt();
        } while (value <= 0 );

        while (value > 0) {
            value = value/10;
            length++;
            System.out.println("계산 " + length + "번");
        }
        System.out.println("입력하신 양의 정수의 자리수는 " + length + "입니다.");

    }







}
