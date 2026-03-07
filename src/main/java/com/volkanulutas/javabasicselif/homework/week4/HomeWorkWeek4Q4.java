package com.volkanulutas.javabasicselif.homework.week4;

import java.util.Scanner;

public class HomeWorkWeek4Q4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Input: ");
        int totalSeconds = scanner.nextInt();

        int hour = totalSeconds/3600;
        int minute = (totalSeconds%3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println("Output: "+ hour +" hour "+ minute +" minute "+ seconds +" seconds ");
    }
}
