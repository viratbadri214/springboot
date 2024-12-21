package com.cisco.student.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long studentId;
    private String studentName;
    private String studentSurname;
    private String studentEmail;
    @NotNull(message = "studentPhone shouldn't null")
    private String studentPhone;
    @OneToOne
    @JoinColumn(name = "fkAid")
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
