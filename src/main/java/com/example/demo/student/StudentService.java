package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class StudentService {

    public Student getStudents() {

       return    new Student(
               1L,
               "Mariam",
               "mariam.jain@gmail.com",
               LocalDate.of(2000, Month.JANUARY, 5),
               21);

    }
}
