package com.volkanulutas.javabasicselif.lesson.week2.lesson2_variable;

public class W2L4_NamingRules {
    public static void main(String[] args) {
        String nameSurname = "sss";

        int myVar = 5;
        //int 5myVar; // can not begin with digit. Must begin letter.
        int _myVar = 2; // _ is also letter.
        int myVarTemp = 2;
        int myVar5_$ = 5;
        int myvar = 5; // case-sensitive.

        Integer  a = Integer.valueOf(5);
        String String = "a";
        System.out.println(String);
        int Integer =0;
        System.out.println(a + Integer);
        // int int = 5; // reserve word int, double, float, public, static, void, class, do, while, if, for.
        String numberString = "5";
        System.out.println("a:" + numberString);

        int a1 =5;
        String b1= "5";
        System.out.println("a1:" + (a1 +a1) );
        System.out.println("b1:" + (b1 + b1) );
        b1 = "4";
        System.out.println("b1:" + (b1 + b1) );



        // camel case best practise
        int myVariableIsCamelCase = 2; // Not Best Practise: MyVariableIsCamelCase, myVariableisCamelCase, myVariableIsCamelCASE
    int myVariableIsCamelCase2 = 2;
    }


}
