package com.volkanulutas.javabasicselif.lesson.week10.ifcondition;

public class W3L13_Condition_03 {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 922337211; //  int secondNumber = 1;
        if (firstNumber > secondNumber) {
            System.out.println("Birinci sayı daha büyük.");
        } else if (firstNumber == secondNumber) {
            System.out.println("İki sayı birbirine eşit. ");
        }
        else {
            System.out.println("İkinci sayı daha büyük.");
        }
    }
}