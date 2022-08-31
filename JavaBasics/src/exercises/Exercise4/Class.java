package exercises.Exercise4;

import java.util.Arrays;

import exercises.Exercise3.Q1.Student;

public class Class {

    private String id;
    private String name;
    private Student[] students = new Student[50];

    public Class(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] == null) {
                this.students[i] = student;
                System.out.println("Student added...");
                return;
            }
        }
    }

    public int getStudentsAmount() {
        int count = 0;
        for (Student student : students) {
            if (student != null) {
                count += 1;
            }
        }
        return count;
    }

    public void showStudents() {
        for (int i = 0; i < this.students.length; i++) {
            Student student = this.students[i];
            if (student != null) {
                System.out.println(student.toJson());
            }
        }
    }

    public void showApprovedStudents() {

    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", students='" + Arrays.toString(getStudents()) + "'" +
                "}";
    }

}
