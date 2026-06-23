package com.volkanulutas.javabasicselif.lesson.week10.methods;

public class W7L12_MethodOverloading {
    public static void main(String[] args) {
        /**
         *  Method Overloading:  aynı isimli metotla farklı parametre tipleri çağrılabilir. Java hangi metotu çağıracağını parametre tipindenanlayabilir.
         */
        sum(); // no input, no return. Sadece 1+5'i toplar.
        sum(1, 5); // 2 input parameter, no return. Verilen iki tam sayıyı toplar. method adı aynı dikkat: sum()
        sum(4.0, 3.0); // 2 input parameter, no return. Verilen iki kesirli sayıyı toplar. method adı aynı dikkat: sum()
        sum("Ali", "Ahmet"); // 2 input parameter, no return. Verilen iki metni toplar. method adı aynı dikkat: sum()
        sum('V', 'U');// 2 input parameter, no return. Verilen iki karakteri toplar. method adı aynı dikkat: sum()
        // Playing with concept.
        sum(1.4, 2); // ? *TODO: look
        sum("Volkan", 34);
        // int summary =sum(1,5); parametre ile method overloading yapılır.
    }

    private static void sum() {
        System.out.println(1 + 5);
    }

    private static void sum(int number1, int number2) {
        System.out.println("Sum of integer is calling with the type of parameters: " + (number1 + number2));
    }

    private static void sum(double number1, double number2) {
        System.out.println("Sum of double is calling with the type of parameters: " + (number1 + number2));
    }

    private static void sum(String text1, String text2) {
        System.out.println("Sum of String is calling with the type of parameters: " + (text1 + text2));
    }

    private static void sum(char ch1, char ch2) {
        System.out.println("Sum of Characters is calling with the type of parameters: " + (ch1 + ch2)); // (System.out.println("Sum of Characters is calling with the type of parameters: " + ch1 + ch2);
    }

    private static void sum(String name, int age) {
        System.out.println(name + "'ın yaşı: " + age);
    }
}

