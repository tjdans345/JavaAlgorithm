package com.company.algorithm.loop.practice;

import java.util.Arrays;
import java.util.Scanner;

public class NumberSizeV3 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int length = 0;
        int value;
        String valueString;
        String valueArray [];

        do {
            System.out.println("0이상의 양의정수를 입력해주세요. 자리수가 반환됩니다.");
            value = stdIn.nextInt();
        } while (value <= 0 );

        valueString = String.valueOf(value);
        valueArray = valueString.split("");

        System.out.println("자리수는 " + Arrays.toString(valueArray).length() + "입니다.");



    }







}
