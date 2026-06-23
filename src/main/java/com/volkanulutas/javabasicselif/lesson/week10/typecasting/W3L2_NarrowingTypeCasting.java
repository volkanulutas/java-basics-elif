package com.volkanulutas.javabasicselif.lesson.week10.typecasting;

public class W3L2_NarrowingTypeCasting {
    public static void main(String[] args) {
        double i = 100.245;
        // Narrowing Type Casting
        short j = (short) i;
        int k = (int) i;
        System.out.println("Original Value before Casting:" + i);
        System.out.println("After Type Casting to short:" + j);
        System.out.println("After Type Casting to int:" + k);
    }
}
