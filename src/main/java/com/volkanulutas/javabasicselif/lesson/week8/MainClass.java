package com.volkanulutas.javabasicselif.lesson.week8;

import com.volkanulutas.javabasicselif.lesson.week6.SIS;

public class MainClass {
    public static void main(String[] args) {
        // List<Student>  studentList = new ArrayList<>();
        SIS sis = new SIS();
        boolean isStudentAdd1 = sis.addStudent("V1", 1, 1);
        if (isStudentAdd1) {
            System.err.println("V1 öğrencisi eklendi.");
        } else {
            System.err.println("V1 öğrencisi eklenmedi.");
        }
        sis.addStudent("V1", 1, 1);
        sis.listStudent();
        sis.deleteStudent(1);
        sis.listStudent();
        sis.addStudent("E1", 2, 2);
        boolean isStudentAddFF = sis.addStudent("ff", 2, 2);
        if (isStudentAddFF) {
            System.err.println("ff öğrencisi eklendi.");
        } else {
            System.err.println("ff öğrencisi eklenmedi."); // HTPP 404,
        }
        sis.listStudent();
        //sis.addStudent("V1", 36, 1);






        /*
        List<Student>  studentList = new ArrayList<>();
        studentList.add(new Student("Volkan", 12, 1));
        StudentInformationSystemV3.addStudent(studentList);
        StudentInformationSystemV3.listStudent(studentList);
        System.out.println("*************");
        StudentInformationSystemV3.menu(studentList);

        studentList.clear();
*/
    }
}
