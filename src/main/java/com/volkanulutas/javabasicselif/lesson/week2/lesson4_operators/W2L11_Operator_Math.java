package com.volkanulutas.javabasicselif.lesson.week2.lesson4_operators;

public class W2L11_Operator_Math {
    public static void main(String[] args) {
        // variable definition and value assigning.
        int number1 = 5;
        int number2 = 2;
        // Addition
        System.out.println("Addition");
        System.out.println("5+2=" + (5 + 2));
        System.out.println(number1 + "+" + number2 + "=" + (number1 + number2));
        int additionResult = number1 + number2;
        System.out.println(number1 + "+" + number2 + "=" + additionResult);
        // Subtraction
        System.out.println("Subtraction");
        System.out.println("5-2=" + (5 - 2));
        System.out.println(number1 + "-" + number2 + "=" + (number1 - number2));
        int subtraction = number1 - number2;
        System.out.println(number1 + "-" + number2 + "=" + subtraction);
        // Multiplication
        System.out.println("Multiplication");
        System.out.println("5*2=" + (5 * 2));
        System.out.println(number1 + "*" + number2 + "=" + (number1 * number2));
        int multiplication = number1 * number2;
        System.out.println(number1 + "*" + number2 + "=" + multiplication);
        // Division
        System.out.println("Division");
        System.out.println("5/2=" + (5 / 2));
        System.out.println(number1 + "/" + number2 + "=" + (number1 / number2));
        int division = number1 / number2;
        System.out.println(number1 + "/" + number2 + "=" + division);

        // Division by zero example.
        try {
            System.out.println("5/2=" + (5 / 0));
        } catch (Exception ex) {
            System.out.println("Bir sayiyi sıfıra bölemezsin" + ex);
        }
        // Modulus
        System.out.println("Modulus");
        System.out.println("5%2=" + (5 % 2));
        System.out.println(number1 + "%" + number2 + "=" + (number1 % number2));
        int modulus = number1 % number2;
        System.out.println(number1 + "%" + number2 + "=" + modulus);
        // Increment
        int x = 1;
        System.out.println("Increment: ");
        System.out.println(++x);
        // Decrement
        System.out.println("Decrement: ");
        System.out.println(--x);
        //
        int y = 5;
        y++; // y= y+1;
        System.out.println("y: " + y);
    }
}
