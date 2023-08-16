package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            studentRepository.saveAll(List.of(new Student(
                    1, "Mariam", LocalDate.of(2000, Month.JANUARY, 5), "mariam@gmail.com"
            ), new Student(
                    2, "Wang", LocalDate.of(2000, Month.JULY, 1), "wang@gmail.com"
            )));
        };
    }
}
