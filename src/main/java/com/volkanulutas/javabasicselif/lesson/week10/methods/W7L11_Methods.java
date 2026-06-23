package com.volkanulutas.javabasicselif.lesson.week10.methods;

import java.util.Scanner;

public class W7L11_Methods {
    public static void main(String[] args) {
        helloWorld();
        System.out.println("------------");
        // int summary = sumIntegers(20,12);
        // System.out.println(summary);
        System.out.println(sumIntegers(20, 12));
        int sum = sumIntegers(2, 2);
        System.out.println("Sum of two integer numbers: " + sum);
        System.out.println("------------");

        double sum2 = sumDoubles(2D, 4.0);
        System.out.println("Sum of two double numbers: " + sum2);
        System.out.println("------------");
        sumIntegerAndPrint(2, 2);
        System.out.println("------------");

        // Fonksiyonları (Metotları) tekrar tekrar çağırabiliriz.
        for (int i = 0; i < 10; i++) {
            helloWorld();
        }

        // Kullanıcıdan ismini alıp, ona merhaba diyelim.
        System.out.println("Benim adım Java W5L10 programı, senin adın nedir?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Merhaba, " + name);

        // Şimdi bu kodu metota çıkalım

        sayHi(name);

        sayHi(name);
        sayHi(name);
        System.out.println("Say Hi with user input function");
        // Şimdi input'u da bu metottan alalım
        sayHiWithUserInput();
        scanner.close();
    }

    public static void sayHiWithUserInput() {
        System.out.println("Benim adım Java W5L10 programından sayHiWithUserInput metotu. Senin adın nedir?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Merhaba, " + name);
        // sayHi(name);
        scanner.close();
    }

    public static void sayHi(String name) {
        System.out.println("Merhaba, " + name + " (SAY HI METHOD)");
    }

    public static void helloWorld() {
        System.out.println("Hello World");
    }

    public static int sumIntegers(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

    public static double sumDoubles(double number1, double number2) {
        return number1 + number2;
    }

    private static void sumIntegerAndPrint(int number1, int number2) {
        System.out.println("Sum of two integer numbers and Print in the method: " + (number1 + number2));
    }
}
