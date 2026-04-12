package com.volkanulutas.javabasicselif.lesson.week7;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int[] sayilar = {12, 5, 8, 21, 3, 45, 17, 9, 2, 30};


        for (int i = 0; i < sayilar.length / 2; i++) {
            int temp = sayilar[i];
            sayilar[i] = sayilar[sayilar.length - 1 - i];
            sayilar[sayilar.length - 1 - i] = temp;
        }


        System.out.print("Ters çevrilmiş dizi: ");
        for (int sayi : sayilar) {
            System.out.print(sayi + " ");
        }


        Scanner scanner = new Scanner(System.in);
        System.out.print("\nBir eşik değer giriniz: ");
        int esik = scanner.nextInt();

        int sayac = 0;

        System.out.print("Eşik değerden küçük sayılar: ");
        for (int sayi : sayilar) {
            if (sayi < esik) {
                System.out.print(sayi + " ");
                sayac++;
            }
        }

        System.out.println("\nToplam adet: " + sayac);

        scanner.close();
    }


    }

