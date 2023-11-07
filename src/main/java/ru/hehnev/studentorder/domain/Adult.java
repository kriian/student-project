package ru.hehnev.studentorder.domain;

import java.time.LocalDate;

public class Adult extends Person{
    private String passportSeria;
    private String passportNumber;
    private LocalDate issuedDate;
    private String issuedDepartment;
    private String university;
    private String studentId;

    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getIssuedDepartment() {
        return issuedDepartment;
    }

    public void setIssuedDepartment(String issuedDepartment) {
        this.issuedDepartment = issuedDepartment;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String getPersonString() {
        return super.getPersonString() + " " + passportNumber;
    }
}
