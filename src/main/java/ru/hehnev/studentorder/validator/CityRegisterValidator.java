package ru.hehnev.studentorder.validator;

import ru.hehnev.studentorder.domain.AnswerCityRegister;
import ru.hehnev.studentorder.domain.StudentOrder;

public class CityRegisterValidator {

    private String hostName;
    private String port;
    private String login;
    private String password;

    public AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        System.out.println("City register is running: " + hostName + ", " + login + ", " + password);
        AnswerCityRegister answerCityRegister = new AnswerCityRegister();
        return answerCityRegister;
    }
}
