package com.volkanulutas.javabasicselif.homework.week3;

import java.util.Scanner;

public class HomeWorkWeek3Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bakiye = 1000;
        int secim=0;

        do {
            System.out.println("---------------");
            System.out.println("1- Bakiye Görüntüle");
            System.out.println("2- Para Yatır");
            System.out.println("3- Para Çek");
            System.out.println("4- Çıkış");
            System.out.print("Seçiminiz: ");


            if (!scanner.hasNextInt()) {
                System.out.println("Geçersiz giriş! Lütfen sayı giriniz.");
                scanner.next();
                continue;
            }

            secim = scanner.nextInt();

            switch (secim) {

                case 1:
                    System.out.println("Bakiye: " + bakiye + " TL");
                    break;

                case 2:
                    System.out.print("Yatırılacak Tutar: ");

                    if (!scanner.hasNextDouble()) {
                        System.out.println("Geçersiz tutar!");
                        scanner.next();
                        break;
                    }

                    double yatirilan = scanner.nextDouble();

                    if (yatirilan <= 0) {
                        System.out.println("Tutar pozitif olmalıdır!");
                    } else {
                        bakiye += yatirilan;
                        System.out.println("Yatırılan Tutar: " + yatirilan + " TL");
                        System.out.println("Yeni Bakiye: " + bakiye + " TL");
                    }
                    break;

                case 3:
                    System.out.print("Çekilecek Tutar: ");

                    if (!scanner.hasNextDouble()) {
                        System.out.println("Geçersiz tutar!");
                        scanner.next();
                        break;
                    }

                    double cekilen = scanner.nextDouble();

                    if (cekilen <= 0) {
                        System.out.println("Tutar pozitif olmalıdır!");
                    }
                    else if (cekilen > bakiye) {
                        System.out.println("Yetersiz Bakiye!");
                    }
                    else {
                        bakiye -= cekilen;
                        System.out.println("Çekilen Tutar: " + cekilen + " TL");
                        System.out.println("Kalan Bakiye: " + bakiye + " TL");
                    }
                    break;

                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    break;

                default:
                    System.out.println("Geçersiz seçim! 1-4 arasında bir değer giriniz.");
            }

        } while (secim != 4);

    }
    }

