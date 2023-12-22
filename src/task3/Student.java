package task3;

import java.util.Objects;

public class Student {
    private String name;
    private int group;
    private int kyr;
    private int grade;

    public Student(String name, int group, int kyr, int grade) {
        this.name = name;
        this.group = group;
        this.kyr = kyr;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getKyr() {
        return kyr;
    }

    public void setKyr(int kyr) {
        this.kyr = kyr;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return group == student.group && kyr == student.kyr && grade == student.grade && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, kyr, grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", kyr=" + kyr +
                ", grade=" + grade +
                '}';
    }
}
