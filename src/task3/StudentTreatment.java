package task3;

import java.util.ArrayList;
import java.util.List;

public class StudentTreatment {



    public static void create(){
        Main.integers.add(new Student("Oleg", 2,3,5));
        Main.integers.add(new Student("Petr", 4,2,1));
        Main.integers.add(new Student("Kira", 1,3,4));
        Main.integers.add(new Student("Pupa", 1,3,2));
        Main.integers.add(new Student("Egor", 1,1,2));
        Main.integers.forEach(System.out::println);
        System.out.println("===========================");
    }
    public static void Graded(){
        for (int i = 0; i < Main.integers.size(); i++) {
            Student student = Main.integers.get(i);
            if(student.getGrade() < 3){
               Main.integers.remove(student);
            }
            else {

                student.setKyr(student.getKyr() + 1);

            }

        }
        Main.integers.forEach(System.out::println);
    }
    public static void printStudents(List<Student> students, int course){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getKyr() == course){
                System.out.println(students.get(i).getName());

            }
        }
    }

}
