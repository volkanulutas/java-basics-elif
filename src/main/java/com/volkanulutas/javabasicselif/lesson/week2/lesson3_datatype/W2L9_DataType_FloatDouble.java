package com.volkanulutas.javabasicselif.lesson.week2.lesson3_datatype;

public class W2L9_DataType_FloatDouble {
    public static void main(String[] args) {
        float piNumberFloatingPoint = 3.141592653589793238462643383279502884f; // float piNumberFloatingPoint = 3.141592653589793238462643383279502884F;
        System.out.println("Pi Sayısı (Düşük ondalık Hassasiyet)): " + piNumberFloatingPoint);
        double piNumberDoublePoint =
                3.1415926535897932384626433832795028845343431d; // double piNumberDoublePoint = 3.3.1415926535897932384626433832795028845343431d
        System.out.println("Pi Sayısı (Yüksek ondalık Hassasiyet, Bilimsel Hesaplamalar)): " + piNumberDoublePoint);
    }
}
