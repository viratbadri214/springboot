package com.cisco.student.Dto;

import com.cisco.student.Entity.Address;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder


public class StudentDto {

    private long studentId;
    private String studentName;
    private String studentSurname;
    private String studentEmail;

    private String studentPhone;
    private Address studentAddress;

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public Address getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = studentAddress;
    }
}
