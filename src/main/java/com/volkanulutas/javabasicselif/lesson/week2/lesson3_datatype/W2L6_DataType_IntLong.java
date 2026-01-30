package com.volkanulutas.javabasicselif.lesson.week2.lesson3_datatype;

public class W2L6_DataType_IntLong {
    public static void main(String[] args) {
        int number1 = 1;
        System.out.println("Number: " + number1);
        number1 = 10;
        System.out.println("Number: " + number1);
        // ********************
        long number2 = 1; // long number2 = 1L;
        System.out.println("Number: " + number2);
        number2 = 10; // long number2 = 10l;
        System.out.println("Number: " + number2);
        // ********************
        int bigNumber = 1000000;
        System.out.println("Number: " + bigNumber);
        int largeNumber = 10000000;
        System.out.println("Number: " + largeNumber);
        // ********************
        int tooLargeNumber = 1000000000; // int tooLargeNumber = 10000000000; hata verir.
        System.out.println("Too Large Number: " + largeNumber);
        long tooLargeNumber2 = 10000000000L;
        System.out.println("Too Large Number: " + tooLargeNumber2);
        // ********************
        int maximumIntNumber = 21474836;
        System.out.println("En Büyük Integer Tam Sayı: " + maximumIntNumber);
        long longNumber = 2147483648L;
        System.out.println("Long Tam Sayı: " + longNumber);
        // ********************
        // Daha küçük aralık: -32,768 32,767 arası
        short smallerNumber = 12345; // short smallerNumber = 123456;
        System.out.println(
                "Küçük Sayı: " + smallerNumber); // yapacağımız işlemler küçükse tercih edilebilir memory (hafızayı) etkin kullanmış oluruz.
        // ********************
        // Çok küçük bir aralık:  -127 128 arası
        byte byteNumber = 1;
        System.out.println("Byte number: " + byteNumber);
    }
}
