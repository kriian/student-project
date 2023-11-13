package ru.hehnev.studentorder;

import ru.hehnev.studentorder.domain.Adult;
import ru.hehnev.studentorder.domain.Child;
import ru.hehnev.studentorder.domain.Person;
import ru.hehnev.studentorder.domain.StudentOrder;

public class SaveStudentOrder {

    public static void main(String[] args) {
    }

    public static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("Saving student order ");
        return answer;
    }

    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder studentOrder = new StudentOrder();
        studentOrder.setStudentOrderId(id);
        return studentOrder;
    }
}
