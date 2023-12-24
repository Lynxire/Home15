package task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentTreatment {
    public static void Graded(List<Student> studentList){
        System.out.println("GRADE");
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getGrade() < 3) {
                iterator.remove();
            } else {
                student.setKyr(student.getKyr() + 1);
            }
        }
    }
    public static void printStudents(List<Student> students, int course){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getKyr() == course){
                System.out.println(students.get(i).getName());

            }
        }
    }

}
