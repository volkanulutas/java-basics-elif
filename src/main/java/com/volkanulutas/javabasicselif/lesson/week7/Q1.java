package com.volkanulutas.javabasicselif.lesson.week7;

public class Q1 {

    public static void main(String[] args) {

        int[] sayilar ={12,45,7,23,89,56,2,78,10};

        int toplam = 0;
        int enBuyuk = sayilar[0];
        int indeks = 0;

        for(int i = 0; i< sayilar.length; i++){
            toplam+=sayilar[i];

            if(sayilar[i]> enBuyuk){
                enBuyuk=sayilar[i];
                indeks=i;
            }
        }

        double ortalama = (double) toplam/ sayilar.length;

        System.out.println("Toplam:"+ toplam);
        System.out.println("Ortalama:" + ortalama);
        System.out.println("En büyük sayı:" + enBuyuk);
        System.out.println("En büyük sayının indeksi:"+ indeks);


    }
}
