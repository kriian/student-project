package ru.hehnev.studentorder.validator;

import ru.hehnev.studentorder.domain.AnswerWedding;
import ru.hehnev.studentorder.domain.StudentOrder;

public class WeddingValidator {
    public AnswerWedding checkWedding(StudentOrder studentOrder) {
        System.out.println("Wedding is running");
        return new AnswerWedding();
    }
}
