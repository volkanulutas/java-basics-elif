package com.volkanulutas.javabasicselif.lesson.week10.typecasting;

public class TypeCastingClassExample {
    public static void main(String[] args) {
        int maxScore = 500;
        int userScore = 483;
        float accurateDivision  = ((float) userScore) / maxScore; // ((float) userScore) / ((float) maxScore);
        float accuratePercentage = accurateDivision * 100;
        float percentage = (userScore / maxScore) * 100;
        System.out.println("Data Loss: "+ percentage);
        System.out.println("Accurate Percentage: " + accuratePercentage);
    }
}