package com.cisco.student.Controller;

import com.cisco.student.Dto.StudentDto;
import com.cisco.student.Service.StudentService;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class StudentController {

    @Autowired
    private StudentService studentService;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/save")
    public ResponseEntity<StudentDto> saveStudent(@RequestBody StudentDto studentDto) {

        logger.info("controller Saving student");

        return new ResponseEntity<StudentDto>(studentService.saveStudent(studentDto) ,HttpStatus.CREATED);

    }

    @GetMapping("/get/{name}")
    public String Hello(@PathVariable ("name") String Name)
    {
    	return "Hello";
    }
}
