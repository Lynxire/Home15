package task3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static ArrayList<Student> integers = new ArrayList<Student>();
    public static void main(String[] args) {
        StudentTreatment.create();
        StudentTreatment.Graded();
        StudentTreatment.printStudents(integers,4);

    }


}
