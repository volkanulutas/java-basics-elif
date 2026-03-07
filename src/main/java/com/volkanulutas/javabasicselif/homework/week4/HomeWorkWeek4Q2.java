package com.volkanulutas.javabasicselif.homework.week4;

import java.util.Scanner;
public class HomeWorkWeek4Q2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final String password= "java123";

        System.out.println("Lütfen şifrenizi giriniz:");
        String girilenSifre = scanner.nextLine();

        if(girilenSifre.equals(password)){
            System.out.println("Giriş Başarılı");
        }
        else{
            System.out.println("Giriş Başarısız");
        }

    }
}
