package com.volkanulutas.javabasicselif.lesson.week2.lesson3_datatype;

public class W2L5_DataType {
    public static void main(String[] args) {
        // Identifier, variables.

        // int: Tam Sayı (integer): ..., -2, -1, 0, 1, 2
        int number = 1;
        System.out.println("Tam Sayı: " + number);
        // ********************
        // long: Büyük Tam sayılar: -1, -2, 0, 1, 2 gibi.
        int a1 = 1000000000;
        long a2 = 10000000000L;




        long bigNumber = 10000000000L; // long bigNumber = 10000000000l;
        System.out.println("Büyük Tam  Sayı: " + bigNumber);
        // ********************
        // float: Kesirli (Ondalıklı) sayılar: 1.0, 1.2, 5.4, 3,611142, -1,59 gibi.
        float floatingPointNumber = 3.14F;
        // ********************
        System.out.println("Ondalıklı Sayı: "+ floatingPointNumber);
        // double: Hassasiyeti Büyük kesirli sayılar: 1.0, 1.2, 5.4, 3,611142, -3.141592653589793238462643383279502884,
        // Virgülden sonra daha çok veri tutmak için tercih edilebilir.
        double doublePointNumber = 3.141592653589793238462643383279502884D;
        double d = 3.14D;
        // ********************
        // char: Karakter tek haneli String veri:
        char character = 'A';
        System.out.println("Karakter: " + character);
        // ********************
        // boolean: Boolean (Mantıksal) Değerler: true | false gibi.
        boolean booleanValue = false;
        System.out.println("Mantıksal Değer: " + booleanValue);
        // ********************
        String name = "Volkan"; // Diğer veri türlerine göre String kelimesinin ilk harfi büyüktür, bunun bir mantığı var ileride anlatılacaktır.
        System.out.println("isim: " + name);
    }
}
