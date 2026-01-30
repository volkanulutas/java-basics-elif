package com.volkanulutas.javabasicselif.lesson.week2.lesson4_operators;

public class W2L13_DataType_Final_Keyword {
    public static void main(String[] args) {

        int a = 5;
        System.out.println("a=" + a);
        a = 4;
        System.out.println("a=" + a);

        final int myNum = 15;
        // myNum = 20;  // giving compile time error.
        System.out.println("My Num:" + myNum);

        final int myNum2;
        myNum2 = 10;
        // myNum2 = 23; // giving compile time error.
    }
}
