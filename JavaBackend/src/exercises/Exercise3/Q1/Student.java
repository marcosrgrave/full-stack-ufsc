package exercises.Exercise3.Q1;

import java.util.HashMap;
import java.util.Map;

import exercises.GenerateID;
import exercises.Exercise3.Q2.Date;

public class Student {

    private String registration;
    private String name;
    private Date birthDate;
    private float exam1;
    private float exam2;
    private float exam3;

    public Student() {
        this.registration = "0000000";
        this.name = "Name not defined";
        this.birthDate = new Date("01/01/2001");
        this.exam1 = 0;
        this.exam2 = 0;
        this.exam3 = 0;
    }

    public Student(String name) {
        this.registration = String.valueOf(GenerateID.registrationNumber(7));
        this.name = name;
    }

    public Student(String registration, String name) {
        this.registration = registration;
        this.name = name;
        this.exam1 = 0;
        this.exam2 = 0;
        this.exam3 = 0;
    }

    public Student(String registration, String name, float exam1, float exam2, float exam3) {
        this.registration = registration;
        this.name = name;
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.exam3 = exam3;
    }

    public String getRegistration() {
        return this.registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String date) {
        this.birthDate = new Date(date);
    }

    public float getExam1() {
        return this.exam1;
    }

    public void setExam1(float exam1) {
        this.exam1 = exam1;
    }

    public float getExam2() {
        return this.exam2;
    }

    public void setExam2(float exam2) {
        this.exam2 = exam2;
    }

    public float getExam3() {
        return this.exam3;
    }

    public void setExam3(float exam3) {
        this.exam3 = exam3;
    }

    public float getAverage() {
        float sumProduct = this.exam1 * 2.5f
                + this.exam2 * 2.5f
                + this.exam3 * 5.0f;
        float sumWeight = 2.5f + 2.5f + 5.0f;
        float average = sumProduct / sumWeight;
        return average;
    }

    public String toString() {
        return "Registration: " + this.registration + "\n" +
                "Name: " + this.name + "\n" +
                "Birth Date: " + this.birthDate + "\n" +
                "Exam1: " + this.exam1 + "\n" +
                "Exam2: " + this.exam2 + "\n" +
                "Exam3: " + this.exam3;
    }

    public Map<String, Object> toJson() {
        Map<String, Object> json = new HashMap<>();
        json.put("registration", this.registration);
        json.put("name", this.name);
        json.put("birthDate", this.birthDate);
        json.put("exam1", this.exam1);
        json.put("exam2", this.exam2);
        json.put("exam3", this.exam3);
        return json;
    }

}
