package com.volkanulutas.javabasicselif.lesson.week10.typecasting;

public class W3L6_TypeCasting_Example_03 {
    public static void main(String[] args) {
        // Byte promoted to int
        byte i = 10; // 00001010 - 10 // 11111111 - ? -> 127 // 255 tutulamaz mi? //  ----- 0 ++++
        int x = i + 5;
        System.out.println("byte converted int -> " + x);
        // Short promoted to int
        short short_num = 15;
        int big = short_num + 115;
        System.out.println("short converted int -> " + big);
        // int promoted to double
        int num = 5;
        double bigNum = num + 15.5;
        System.out.println("int converted double -> " + bigNum);
    }
}
