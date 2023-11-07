package ru.hehnev.studentorder;

import ru.hehnev.studentorder.domain.*;
import ru.hehnev.studentorder.mail.MailSender;
import ru.hehnev.studentorder.validator.ChildrenValidator;
import ru.hehnev.studentorder.validator.CityRegisterValidator;
import ru.hehnev.studentorder.validator.StudentValidator;
import ru.hehnev.studentorder.validator.WeddingValidator;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterValidator;
    private WeddingValidator weddingValidator;
    private ChildrenValidator childrenValidator;
    private StudentValidator studentValidator;
    private MailSender mailSender;

    public StudentOrderValidator() {
        this.cityRegisterValidator = new CityRegisterValidator();
        this.weddingValidator = new WeddingValidator();
        this.childrenValidator = new ChildrenValidator();
        this.studentValidator = new StudentValidator();
        this.mailSender = new MailSender();
    }

    public static void main(String[] args) {
        StudentOrderValidator studentOrderValidator = new StudentOrderValidator();
        studentOrderValidator.checkAll();
    }

    public void checkAll() {
        while (true) {
            StudentOrder studentOrder = readStudentOrder();
            if (studentOrder == null) {
                break;
            }
            AnswerCityRegister answerCityRegister = checkCityRegister(studentOrder);
            if (!answerCityRegister.isSuccess()) {
                continue;
            }
            AnswerWedding answerWedding = checkWedding(studentOrder);
            AnswerChildren answerChildren = checkChildren(studentOrder);
            AnswerStudent answerStudent = checkStudent(studentOrder);

            sendMail(studentOrder);
        }
    }

    private StudentOrder readStudentOrder() {
        StudentOrder studentOrder = new StudentOrder();
        return studentOrder;
    }

    public AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        return cityRegisterValidator.checkCityRegister(studentOrder);
    }

    public AnswerWedding checkWedding(StudentOrder studentOrder) {
        return weddingValidator.checkWedding(studentOrder);
    }

    public AnswerChildren checkChildren(StudentOrder studentOrder) {
        return childrenValidator.checkChildren(studentOrder);
    }

    public AnswerStudent checkStudent(StudentOrder studentOrder) {
        return studentValidator.checkStudent(studentOrder);
    }

    private void sendMail(StudentOrder studentOrder) {
        mailSender.sendMail(studentOrder);
    }
}
