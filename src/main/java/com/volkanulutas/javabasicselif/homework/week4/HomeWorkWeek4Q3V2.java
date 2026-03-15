package com.volkanulutas.javabasicselif.homework.week4;

public class HomeWorkWeek4Q3V2 {
    public static void main(String[] args) {
        int sayi=12345;
        System.out.println(sayi);
        String string= "";
        string=Integer.toString(sayi);
        char charArray[]= new char[5];

        String string2=sayi+"";


        for(int i=0;i<string.length();i++){
            System.out.print(string.charAt(i));
            char temp=string.charAt(i);
            charArray[string.length()-1-i]=temp;


        }   System.out.println("");
        for(int i=0;i<charArray.length;i++){
            System.out.print(charArray[i]);
        }
    }
}
