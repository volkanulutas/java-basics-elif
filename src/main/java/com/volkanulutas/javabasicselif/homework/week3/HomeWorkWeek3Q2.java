package com.volkanulutas.javabasicselif.homework.week3;

import java.util.Scanner;

public class HomeWorkWeek3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }

        scanner.close();
    }
}
