package com.jaydaNj._4.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("student")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudent(){
        return List.of(new Student(UUID.randomUUID(),"James","Nan","bestnanjames@gmail.com", Student.Gender.MALE),
                new Student(UUID.randomUUID(),"JJ","Bond","bestbondjj@gmail.com", Student.Gender.FEMALE));
    }
}
