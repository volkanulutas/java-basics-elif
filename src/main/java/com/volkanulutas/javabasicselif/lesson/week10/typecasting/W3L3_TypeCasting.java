package com.volkanulutas.javabasicselif.lesson.week10.typecasting;

public class W3L3_TypeCasting {
    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double.
        int number1 = 10;
        int number2 = 5;
        System.out.println("number1 / number2 = " + number1 / number2); // System.out.println("number1/number2 = " + (number1 / number2) );
        float number3 = 10;
        float number4 = 3.1F;
        System.out.println("number3 / number4 = " + (number3 / number4));
        // ********************
        System.out.println("Sonuç1= " + (5 / 3)); // iki tam sayıyı bölersek sonucu tam sayı istediğimizi düşünüyor. Ondalıklı ile uğraşmıyoruz.
        System.out.println("Sonuç2= " + (5 / 3.0)); // İki sayıdan biri ondalıklı olursa sonuç ondalıklı oluyor bunu önemsediğimizi düşünüyor.
        System.out.println("Sonuç3= " + (5.0 / 3));
        // ********************
        // Kesirli -> Tam Sayı Dönüşümü
        float floatingNumber = 3.14F; // 3.14 yazamıyoruz F veya D hassasiyetinde tutmamızı karar vermemizi istiyor.
        int integerNumber = (int) floatingNumber;
        System.out.println("Kesirli -> Tam Sayı Dönüşümü (Yuvarlama): " + integerNumber);
        // ********************
        // Sayı -> Metin Dönüşümü
        System.out.println(45 + "");
        int intNumber = 456;
        String text = String.valueOf(intNumber);
        System.out.println("Metin (String) Değeri: " + text);
        float floatNumber = 45.F;
        String textFloat = String.valueOf(floatNumber);
        System.out.println("Metin (String) Değeri: " + textFloat);
        // ********************
        long bigNum1 = 1000L; // 120 kutucuk
        int smallNum1 = (int) bigNum1; //60 kutucuk
        System.out.println("Küçük sayı: " + smallNum1);
        //
        long bigNum2 = 1234567891234567891L; // Dönüşümde veri kaybı olabilir. (Downcasting işleminde veri kaybına dikkat edilmelidir.)
        int smallNum2 = (int) bigNum2;
        System.out.println("Küçük sayı: " + smallNum2);
        //
        int smallNum3 = 5;
        long bigNum3 = (long) smallNum3; // büyük veriyi küçüğe dönüştürürken (long) kullanmasanız da anlarım diyor.
        System.out.println("Küçük sayı: " + smallNum2);
        // ********************
        // char değerinin ASCII değeri, int'e dönüştürülür. Eskiden String yoktu, char ile metinler oluşturuyorduk :)
        char karakter = 'D';
        int asciiDegeri = (int) karakter;
        System.out.println("ASCII değeri: " + asciiDegeri); // ÖDEV: ASCII Tablosu nedir?
        //
        char character = 88;
        System.out.println("Character look ASCII Table: " + character);

    }
}
