package com.volkanulutas.javabasicselif.lesson.week2.lesson4_userinputwithparameters;

import java.util.Scanner;

public class W2L14_User_Input_01 {
    public static void main(String[] args) {
        /* Kullanıcıdan bilgi istemek için Java'da hazır scanner sınıfı kullanılabilir.
        System.in kullanıcının konsoldan veri gireceğini belirtir.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ilk tam sayıyı sayıyı giriniz:");
        int number1 = scanner.nextInt(); // next() -> String, nextFloat()-> Float.
        System.out.println("Lütfen ikinci tam sayıyı sayıyı giriniz:");
        int number2 = scanner.nextInt();
        int multiply = number1 * number2;
        System.out.println(number1 + " x " + number2 + " = " + multiply);
        scanner.close();
    }
}