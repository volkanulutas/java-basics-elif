package com.volkanulutas.javabasicselif.lesson.week2.lesson2_variable;

public class W2L2_DeclareVariables {
    public static void main(String[] args) {
        // 1) Definition: type name;
        // 2) Definition & assigning: type name = value;
        String name; // name değişkenini (variable) tanımlama
        // System.out.println("Name: " + name);
        name = "Taha";
        System.out.println("İsim: " + name);
        // modifying name variable.
        name = "Öykü";
        System.out.println("İsim: " + name);

        // ******************************************
        String name2 = "Taha"; // name değişkeni (variable) tanımlama ve değer atama.
        System.out.println("İsim2: " + name2);
        System.out.println("İsim2: " + name2);
        name2 = "Öykü"; // name değişkenini (variable) değer atama. (değeri değiştirdik, bundan sonraki alt satırlarda artık "Öykü" olarak atanmış olur.
        System.out.println("isim2: " + name2);


    }
}
