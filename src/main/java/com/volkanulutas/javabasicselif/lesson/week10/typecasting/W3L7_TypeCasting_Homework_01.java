package com.volkanulutas.javabasicselif.lesson.week10.typecasting;

public class W3L7_TypeCasting_Homework_01 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 15;
        boolean result = (x < y) && (y > z) || (x + z >= y);
        if (result) {
            System.out.println("Karmaşık ifade doğru.");
        } else {
            System.out.println("Karmaşık ifade yanlış.");
        }
    }
}
