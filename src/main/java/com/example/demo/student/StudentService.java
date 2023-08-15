package com.example.demo.student;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(1, "Phat", 10, LocalDate.of(2000, Month.JANUARY, 1), "phat@gmail.com"),
                new Student(2, "Quang", 22, LocalDate.of(2000, Month.JANUARY, 1), "wang@gmail.com"));

    }
}
