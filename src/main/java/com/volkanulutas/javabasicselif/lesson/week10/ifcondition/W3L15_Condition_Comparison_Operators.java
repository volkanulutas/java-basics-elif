package com.volkanulutas.javabasicselif.lesson.week10.ifcondition;

public class W3L15_Condition_Comparison_Operators {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int z = 7;

        if (x > y && x < z) {
            System.out.println("x, y'den büyük ve z'den küçüktür.");
        }

        if (x < y || x > z) {
            System.out.println("x, y'den küçük veya z'den büyüktür.");
        }

        boolean isTrue = true;
        if (!isTrue) {
            System.out.println("isTrue değeri false'tur.");
        }
    }
}
