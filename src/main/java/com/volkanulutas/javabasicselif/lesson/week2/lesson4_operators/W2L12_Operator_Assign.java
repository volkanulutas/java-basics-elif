package com.volkanulutas.javabasicselif.lesson.week2.lesson4_operators;

public class W2L12_Operator_Assign {
    public static void main(String[] args) {
        String text1 = "Volkan";
        String text2 = "Ulutaş";
        System.out.println(text1 + text2);
        int num1 = 10;
        int num2 = 7;
        System.out.println("Toplam: " + (num1 + num2));
        // Below operator most least used.
        // += operator
        // num1 = num1+1; num++; // this is enough.
        num1 += 2; // num1 = num1 +2;
        System.out.println("+=2 sonrası: " + num1);
        // -= operator
        num1 -= 2; // num1 = num1 - 2;
        System.out.println("-=2 sonrası: " + num1);
        // *= operator
        num1 *= 2;
        System.out.println("*=2 sonrası: " + num1);
        // /= operator
        num1 /= 2;
        System.out.println("/=2 sonrası: " + num1);
    }
}
