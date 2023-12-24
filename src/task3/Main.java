package task3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static ArrayList<Student> integers = new ArrayList<Student>();

    public static void main(String[] args) {
        create();
        StudentTreatment.Graded(integers);
        StudentTreatment.printStudents(integers, 4);

    }

    public static void create() {
        integers.add(new Student("Oleg", 2, 3, 5));
        integers.add(new Student("Petr", 4, 2, 1));
        integers.add(new Student("Kira", 1, 3, 4));
        integers.add(new Student("Pupa", 1, 3, 2));
        integers.add(new Student("Egor", 1, 1, 2));
        integers.forEach(System.out::println);
        System.out.println("===========================");
    }

}
