package com.volkanulutas.javabasicselif.lesson.week6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentInformationSystemV1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int choose=5;
        List <Student> studentList= new ArrayList<>();

        do {
            System.out.println("Lütfen Seçiniz 1-5 :");
            System.out.println("1-Öğrenci Ekle");
            System.out.println("2-Öğrenci Güncelle");
            System.out.println("3-Öğrenci Sil");
            System.out.println("4-Öğrencileri Listele");
            System.out.println("5-Çıkış");

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
                    for(int i=0;i<studentList.size();i++){
                        if(studentList.get(i).getStudentId()==studentId){
                            isStudentFound=true;

                        }

                    }

                    if(!isStudentFound){

                    Student student= new Student(name,age,studentId);
                    studentList.add(student);}
                    else
                        System.out.println("Girilen id kullanılmaktadır.");
                    break;
                case 2:
                    System.out.println("Öğrenci güncelleme işlemi");
                    System.out.println("Güncellemek istediğiniz öğrencinin id\'sini giriniz:");
                    int findId=scanner.nextInt();
                    scanner.nextLine();
                    boolean isFound=false;
                    for(int i=0;i<studentList.size();i++){

                        if(studentList.get(i).getStudentId()==findId){
                            isFound=true;
                            System.out.println("İsmi güncellemek için 1 yaşı güncellemek için 2'ye basınız");
                            int choose2=scanner.nextInt();
                            scanner.nextLine();
                            if(choose2==1){
                                System.out.println("Güncel isim giriniz:");
                                String newName=scanner.nextLine();
                                studentList.get(i).setName(newName);

                            } else if (choose2==2) {
                                System.out.println("Güncel yaş giriniz:");
                                int newAge=scanner.nextInt();
                                scanner.nextLine();
                                studentList.get(i).setAge(newAge);

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
                    for(int i=0;i<studentList.size();i++) {

                        if (studentList.get(i).getStudentId() == tobeDeletedId) {
                            deletedIndex=i;
                        }
                    }
                    if(deletedIndex==-1){
                        System.out.println("Boyle bir id bulunmamaktadır");
                    }
                    else {
                        studentList.remove(deletedIndex);
                    }



                    break;
                case 4:
                    System.out.println("Listeleme işlemi");
                    if(studentList.isEmpty()){
                        System.out.println("Liste boş");
                    }
                    for(int i=0;i<studentList.size();i++){
                        Student student1=studentList.get(i);
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
