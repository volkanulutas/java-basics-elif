package com.volkanulutas.javabasicselif.homework.week4;

import java.util.Scanner;

public class HomeWorkWeek4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("3 basamaklı bir sayı giriniz:");
        int sayi= scanner.nextInt();

        int birler = sayi%10;
        int onlar = (sayi/10) %10;
        int yuzler= sayi/100;

        int ters = birler*100+onlar*10+yuzler;
        System.out.println(ters);
    }
}
