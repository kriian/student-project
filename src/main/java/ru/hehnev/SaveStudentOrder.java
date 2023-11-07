package ru.hehnev;

public class SaveStudentOrder {

    public static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("Saving student order " + studentOrder.gethLastName());
        return answer;
    }
}
