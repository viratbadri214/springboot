package com.cisco.student.ServiceImpl;

import com.cisco.student.Dto.StudentDto;
import com.cisco.student.Entity.Student;
import com.cisco.student.Repository.StudentRepository;
import com.cisco.student.Service.StudentService;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentRepository studentRepository;

    @Override

    public StudentDto saveStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setStudentId(studentDto.getStudentId());
        student.setStudentName(studentDto.getStudentName());
        student.setStudentSurname(studentDto.getStudentSurname());
        student.setStudentEmail(studentDto.getStudentEmail());
        student.setStudentAddress(studentDto.getStudentAddress());
        student.setStudentPhone(studentDto.getStudentPhone());
        studentRepository.save(student);
        return studentDto;
    }
}
