package com.volkanulutas.javabasicselif.lesson.week10.ifcondition;

public class W3L16_Condition_LoginProject {
    public static void main(String[] args) {
        String username = "volkanulutas@gmail.com";
        String password = "12345";
        if ("volkanulutas@gmail.com".equals(username) && "12345" == password) { // equals
            System.out.println("Giriş başarılı. Hoş geldiniz " + username);
        } else {
            System.out.println("Kullanıcı adı veya parola hatalı!");
        }
    }
}