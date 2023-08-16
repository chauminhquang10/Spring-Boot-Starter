package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

import java.text.MessageFormat;


@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Student newStudent) {
        Optional<Student> checkStudent = studentRepository.findStudentByEmail(newStudent.getEmail());
        if (checkStudent.isPresent()) {
            throw new IllegalStateException("Already email existed!");
        }
        studentRepository.save(newStudent);
    }


    public void deleteStudent(Integer id) {
        boolean isExisted = studentRepository.existsById(id);
        if (!isExisted) {
            throw new IllegalStateException("No student exist with id: " + id);
        } else {
            studentRepository.deleteById(id);
        }
    }
}
