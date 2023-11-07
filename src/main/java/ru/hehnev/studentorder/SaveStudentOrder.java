package ru.hehnev.studentorder;

import ru.hehnev.studentorder.domain.Adult;
import ru.hehnev.studentorder.domain.StudentOrder;

public class SaveStudentOrder {

    public static void main(String[] args) {
        buildStudentOrder();
    }

    public static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("Saving student order ");
        return answer;
    }

    public static StudentOrder buildStudentOrder() {
        StudentOrder studentOrder = new StudentOrder();
        Adult husband = new Adult();
        husband.setGivenName("Андрей");
        husband.setSurName("Петров");
        husband.setPassportNumber("123456");
        studentOrder.setHusband(husband);
        System.out.println(husband.getPersonString());
        return studentOrder;
    }
}
