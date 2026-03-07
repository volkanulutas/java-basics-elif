package com.volkanulutas.javabasicselif.homework.week4;

import java.util.Scanner;

public class HomeWorkWeek4Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sayilar = new int[3];
        boolean hata;

        do{
            hata=false;

            try{
                System.out.println("Lütfen 3 adet tam sayı giriniz:");

                for(int i=0;i<3;i++){
                    sayilar[i]= scanner.nextInt();
                }

                for (int i=0;i< sayilar.length-1;i++){
                    for(int j=0; j< sayilar.length-1;j++){

                        if(sayilar[j]<sayilar[j+1]){
                            int temp=sayilar[j];
                            sayilar[j]= sayilar[j+1];
                            sayilar[j+1]=temp;
                        }
                    }
                }
                System.out.println(sayilar[0] + ">"+ sayilar[1] + ">" + sayilar[2]);
            }

            catch (Exception e){
                System.out.println("Hatalı Giriş! Lütfen tam sayı giriniz");
                scanner.nextLine();
                hata=true;
            }

        } while (hata);

    }
}
