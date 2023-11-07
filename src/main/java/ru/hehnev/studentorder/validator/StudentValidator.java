package ru.hehnev.studentorder.validator;

import ru.hehnev.studentorder.domain.AnswerStudent;
import ru.hehnev.studentorder.domain.StudentOrder;

public class StudentValidator {
    public AnswerStudent checkStudent(StudentOrder studentOrder) {
        System.out.println("Student is running");
        return new AnswerStudent();
    }
}
