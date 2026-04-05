package com.volkanulutas.javabasicselif.lesson.week6;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentInformationSystemV2 {
   public static final int MAX_SIZE=5;

    public static void main(String[] args) {


       int currentSize=0;
        Scanner scanner= new Scanner(System.in);
        int choose=5;
        //List <Student> studentList= new ArrayList<>();
        Student[] studentList= new  Student[MAX_SIZE];

      /*  Integer[] arr = new Integer[10];
        arr[0]=1;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        } */

        do {
            System.out.println("Lütfen Seçiniz 1-5 :");
            System.out.println("1-Öğrenci Ekle");
            System.out.println("2-Öğrenci Güncelle");
            System.out.println("3-Öğrenci Sil");
            System.out.println("4-Öğrencileri Listele");
            System.out.println("5-Çıkış");
            System.err.println(currentSize);

            choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {

                case 1:
                    System.out.println("Ogrenci ekleme işlemi");
                    System.out.println("İsim giriniz");
                    String name=scanner.nextLine();
                    System.out.println("Yaş giriniz");
                    int age=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Id giriniz:");
                    int studentId=scanner.nextInt();
                    scanner.nextLine();
                    boolean isStudentFound=false;

                    for(int i=0;i<currentSize;i++){

                       // Student studentCurrent=studentList[i];

                        if(studentList[i].getStudentId()==studentId){
                            isStudentFound=true;

                        }

                    }

                    if(!isStudentFound) {

                        Student student = new Student(name, age, studentId);
                        studentList[currentSize] = student;
                        currentSize++;
                    }
                    else
                        System.out.println("Girilen id kullanılmaktadır.");
                    break;
                case 2:
                    System.out.println("Öğrenci güncelleme işlemi");
                    System.out.println("Güncellemek istediğiniz öğrencinin id\'sini giriniz:");
                    int findId=scanner.nextInt();
                    scanner.nextLine();
                    boolean isFound=false;
                    for(int i=0;i<currentSize;i++){

                        if(studentList[i].getStudentId()==findId){
                            isFound=true;
                            System.out.println("İsmi güncellemek için 1 yaşı güncellemek için 2'ye basınız");
                            int choose2=scanner.nextInt();
                            scanner.nextLine();
                            if(choose2==1){
                                System.out.println("Güncel isim giriniz:");
                                String newName=scanner.nextLine();
                                studentList[i].setName(newName);

                            } else if (choose2==2) {
                                System.out.println("Güncel yaş giriniz:");
                                int newAge=scanner.nextInt();
                                scanner.nextLine();
                                studentList[i].setAge(newAge);

                            }
                            else
                                System.out.println("Yanlış seçim yaptınız");


                        }
                    }
                    if(!isFound){
                    System.out.println("Girdiğiniz id\' li öğrenci bulunamadı.");
                    }

                    break;
                case 3:
                    System.out.println("Öğrenci silme işlemi");
                    System.out.println("Silmek istediğiniz öğrencinin id\'sini giriniz ");
                    int tobeDeletedId=scanner.nextInt();
                    scanner.nextLine();
                    int deletedIndex=-1;
                    for(int i=0;i<=currentSize;i++) {

                        if (studentList[i].getStudentId() == tobeDeletedId) {
                            deletedIndex=i;
                            for(int j=deletedIndex;j<currentSize+1;j++){
                                if(currentSize!=deletedIndex){
                                studentList[j]=studentList[j+1];
                                }

                            }
                        }
                    }

                    if(deletedIndex==-1){
                        System.out.println("Boyle bir id bulunmamaktadır");
                    }
                    else {
                        currentSize--;
                    }



                    break;
                case 4:
                    System.out.println("Listeleme işlemi");
                    if(currentSize==0){
                        System.out.println("Liste boş");
                    }
                    for(int i=0;i<currentSize;i++){
                        Student student1=studentList[i];
                        System.out.println(student1.getName() +" "+student1.getAge()+" "+student1.getStudentId());
                    }

                    break;
                default:
                    System.out.println("Çıkış");
                    System.exit(0);


            }
        }
        while (choose<=5);


    }
}
