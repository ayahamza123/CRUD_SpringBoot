package com.example.demo.Student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    public List<Student> GetStudents() {
        return List.of(
                new Student(
                        1L,
                        "Mouna",
                        "Mouna@gmail.com",
                        LocalDate.of(2000, Month.DECEMBER,22),
                        14
                )
        );
    }
}
