package com.volkanulutas.javabasicselif.homework.week4;

public class HomeWorkWeek4Q3V3 {
    public static void main(String[] args) {
        int number=12345;
        String word= Integer.toString(number);
        // String string= number+"";

           char a[]=word.toCharArray();

           for(int i=0;i<a.length;i++){
               System.out.print(a[i]);
           }
        System.out.println("");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }


    }





}
