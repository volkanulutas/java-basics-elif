package com.volkanulutas.javabasicselif.lesson.week10.ifcondition;

public class W3L11_Condition_01 {
    public static void main(String[] args) {
        // String weather = "Yağmurlu";
        String weather = "Güneşli";
        // weather = null;
        if (/*weather != null && */ "Güneşli".equals(weather)) { // "".equals("") // == not use!
            // if (weather != null &&  weather.equals("Güneşli")) { // if weather == null that could be error in equals methods.
                System.out.println("Dışarı çıkmak için tişört giymenizi öneririm.");
        } else {
            System.out.println("Dışarı çıkmak için mont giymenizi öneririm.");
        }
    }
}