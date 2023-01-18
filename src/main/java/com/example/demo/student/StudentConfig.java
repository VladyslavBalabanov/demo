package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student artur = new Student(
                    "Artur",
                    "artur@gmail.com",
                    LocalDate.of(2003, APRIL, 1)
            );
            Student kate = new Student(
                    "Kate",
                    "kate@gmail.com",
                    LocalDate.of(2004, NOVEMBER, 24)
            );
            Student mary = new Student(
                    "Mary",
                    "mary@gmail.com",
                    LocalDate.of(2005, JANUARY, 6)
            );
            repository.saveAll(
                    List.of(artur, kate, mary)
            );
        };
    }
}
