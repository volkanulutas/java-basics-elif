package com.volkanulutas.javabasicselif.lesson.week10.typecasting;

public class W3L4_TypeCasting_Example_01 {
    public static void main(String[] args) {
        double x = 15.7;
        int y = 3;
        double z = 2.5;
        // The statement
        double result = (int) (x / y) + (x % y) * (int) z; // 5 + 0,6999 * 2
        System.out.println("Sonuç: " + result);
    }
}
