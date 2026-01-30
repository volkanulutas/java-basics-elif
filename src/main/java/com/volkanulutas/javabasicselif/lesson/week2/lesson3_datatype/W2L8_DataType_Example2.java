package com.volkanulutas.javabasicselif.lesson.week2.lesson3_datatype;

public class W2L8_DataType_Example2 {
    public static void main(String[] args) {

        int x = 6;
        double y = 4.8;


        System.out.println( (int) (x+y));
        int summ =  (int) (x+y);
        System.out.println("summ:" + summ);

        double doubleDeger  =  (x+y);

        // Define int variables
        int num1 = 5004;
        double num2 = 2.5;
        // int sum = num1 + num2; // give error
        int sum = (int) (num1 + num2); // 5004 + 2,5 = 5006,5
        double sum1 = num1 +num2;
        // show output
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        // ********************
        num1 = 5004;
        num2 = 2.5;
        double sum2 = num1 + num2;
        // show output
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum2);

        int x1 = 5;
        int y1 = 2;
        int s1 = (int) (x1 / y1);
      System.out.println(s1);
    }
}
