package model;

import java.util.Objects;

public class Student implements Comparable {

    public String name;

    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "name='" + name + ", grade=" + grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return grade == student.grade && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }

    @Override
    public int compareTo(Object o){
        Student student = (Student) o;

        if (grade > student.getGrade()) return 1;
        if (grade < student.getGrade()) return -1;
        return 0;
    }
}
