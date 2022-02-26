package ch.test;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Student> studentList1 = new ArrayList<Student>();
        List<Student> studentList2 = new ArrayList<Student>();

        Teacher teacher1 = new Teacher("Tahir", "Yaman",1985, "Matematik");
        Teacher teacher2 = new Teacher("Adnan", "Bora", 1978, "Ingilizce");

        Student student1 = new Student("Ahmet","Aydin", 2005);
        Student student2 = new Student("Ayse" , "Halis" , 2004);
        Student student3 = new Student("Mehmet","Dogan", 2005);
        Student student4 = new Student("Ali" , "Veli" , 2004);
        Student student5 = new Student("Fatma","Kara", 2005);
        Student student6 = new Student("Gül" , "Yildiz" , 2004);
        Student student7 = new Student("Enes","Capar", 2005);
        Student student8 = new Student("Burak" , "Ak" , 2004);
        Student student9 = new Student("Hasan","Yilmaz", 2005);
        Student student10 = new Student("Emine" , "Sila" , 2004);



        studentList1.add(student1);
        studentList1.add(student2);
        studentList1.add(student3);
        studentList1.add(student4);
        studentList1.add(student5);

        studentList2.add(student6);
        studentList2.add(student7);
        studentList2.add(student8);
        studentList2.add(student9);
        studentList2.add(student10);


        Classroom classroom1 = new Classroom( studentList1, teacher1 ,"Bern" ,"A");
        Classroom classroom2 = new Classroom(studentList2, teacher2, "Zurich", "B" );

        int sayi = (int)(Math.random()*10);

        System.out.println("Location: " + classroom1.getLocation() +" "+ classroom1.getName());
        System.out.println("Teacher: "+ classroom1.getTeacher().getFirstName() + " " + classroom1.getTeacher().getLastName());
        for (Student student: classroom1.getStudents()){

                System.out.println(student.getFirstName() +" " + student.getLastName() +" " + student.getBirthday() );
        }
        System.out.println("_______________________________");
        System.out.println("Location: " + classroom2.getLocation() +" "+ classroom2.getName());
        System.out.println("Teacher: " + classroom2.getTeacher().getFirstName() + " " + classroom2.getTeacher().getLastName());
        for (Student student: classroom2.getStudents()){

            System.out.println(student.getFirstName() +" " + student.getLastName() +" " + student.getBirthday() );
        }

    }
}
