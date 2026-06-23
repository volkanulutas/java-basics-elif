package com.volkanulutas.javabasicselif.lesson.week10.matlib;

public class W3L19_MathLib {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int min = Math.min(x, y);
        System.out.println("Minimum: " + min);
        // **********
        int max = Math.max(x, y);
        System.out.println("Maximum: " + max);
        // **********
        int z = -5;
        System.out.println("Absolute Value: " + Math.abs(z));
        // **********
        double doubleVal = -5.14;
        double abs = Math.abs(doubleVal);
        System.out.println("|" + doubleVal + "|= " + abs);
        // **********
        double y_power_x = Math.pow(y, x);
        System.out.println("y^x= " + y_power_x);
        // **********
        System.out.println("5^2 = " + Math.pow(5, 2));
        System.out.println("16'nın karekökü: " + Math.sqrt(16));
        System.out.println("e^4: " + Math.exp(4));
        System.out.println("10 sayısının logaritması: " + Math.log(10));
        System.out.println("log10(10):" + Math.log10(10));
        // **********
        double derece = 90;
        double radyan = Math.toRadians(derece);
        double sin90 = Math.sin(radyan);
        System.out.println("sin(90): " + sin90);
        // **********
        double derece2 = 180;
        double radyan2 = Math.toRadians(derece2);
        double cos180 = Math.cos(radyan2);
        System.out.println("cos(180): " + cos180);
        // **********
        double floor = Math.floor(5.9D);
        System.out.println("Floor Yuvalarma (Zemin): " + floor);
        double floor2 = Math.round(5.2D);
        System.out.println("Floor Yuvalarma (Zemin): " + floor2);
        long round = Math.round(5.9D);
        System.out.println("round Yuvalarma: " + round);
        long round2= Math.round(5.2D);
        System.out.println("round Yuvalarma: " + round2);
        double ceil = Math.ceil(5.9D);
        System.out.println("Ceil Yuvalarma (Yukarı): " + ceil);
        double ceil2 = Math.ceil(5.2D);
        System.out.println("Ceil Yuvalarma (Yukarı): " + ceil2);
    }
}
