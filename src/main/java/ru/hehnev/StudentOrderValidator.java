package ru.hehnev;

public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    public static void checkAll() {
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

    private static StudentOrder readStudentOrder() {
        StudentOrder studentOrder = new StudentOrder();
        return studentOrder;
    }

    public static AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        return new CityRegisterValidator().checkCityRegister(studentOrder);
    }

    public static AnswerWedding checkWedding(StudentOrder studentOrder) {
        return new WeddingValidator().checkWedding(studentOrder);
    }

    public static AnswerChildren checkChildren(StudentOrder studentOrder) {
        return new ChildrenValidator().checkChildren(studentOrder);
    }

    public static AnswerStudent checkStudent(StudentOrder studentOrder) {
        return new StudentValidator().checkStudent(studentOrder);
    }

    private static void sendMail(StudentOrder studentOrder) {
        new MailSender().sendMail(studentOrder);
    }
}
