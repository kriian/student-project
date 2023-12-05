package ru.hehnev.studentorder.validator;

import ru.hehnev.studentorder.domain.children.AnswerChildren;
import ru.hehnev.studentorder.domain.StudentOrder;

public class ChildrenValidator {
    public AnswerChildren checkChildren(StudentOrder studentOrder) {
        System.out.println("Children is running");
        return new AnswerChildren();
    }
}
