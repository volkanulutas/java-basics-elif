package com.volkanulutas.javabasicselif.lesson.week6;

public class Student {

    private String name;
    private int age;
    private final int studentId;

    public Student(String name2, int age, int studentId){
        name=name2;
        this.age=age;
        this.studentId=studentId;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }



}
