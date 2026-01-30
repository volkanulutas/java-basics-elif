package com.volkanulutas.javabasicselif.lesson.week2.lesson3_datatype;

public class W2L7_DataType_Example1 {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double // myDouble = 9;
        myDouble = (double) myInt; // It is normal
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
    }
}
