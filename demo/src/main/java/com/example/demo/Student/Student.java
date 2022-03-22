package com.example.demo.Student;
import jdk.jfr.Enabled;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table
public class Student{
    @Id
    @SequenceGenerator(
        name="student_sequence",
        sequenceName="student_sequence",
        allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long Id;
    private String Name;
    private String Email;
    private LocalDate Dob;
    private Integer Age;
    public Student() {

    }

    public Student(Long id, String name, String email, LocalDate dob, Integer age) {
        Id = id;
        Name = name;
        Email = email;
        Dob = dob;
        Age = age;
    }

    public Student(String name, String email, LocalDate dob, Integer age) {
        Name = name;
        Email = email;
        Dob = dob;
        Age = age;
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public LocalDate getDob() {
        return Dob;
    }

    public Integer getAge() {
        return Age;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setDob(LocalDate dob) {
        Dob = dob;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Dob=" + Dob +
                ", Age=" + Age +
                '}';
    }
}
