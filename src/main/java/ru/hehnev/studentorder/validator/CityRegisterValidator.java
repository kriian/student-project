package ru.hehnev.studentorder.validator;

import ru.hehnev.studentorder.domain.AnswerCityRegister;
import ru.hehnev.studentorder.domain.CityRegisterCheckerResponse;
import ru.hehnev.studentorder.domain.StudentOrder;
import ru.hehnev.studentorder.exception.CityRegisterException;

public class CityRegisterValidator {

    private String hostName;
    private String port;
    private String login;
    private String password;
    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder studentOrder) {
        try {
            CityRegisterCheckerResponse hans = personChecker.checkPerson(studentOrder.getHusband());
            CityRegisterCheckerResponse wans = personChecker.checkPerson(studentOrder.getWife());
            CityRegisterCheckerResponse cans = personChecker.checkPerson(studentOrder.getChild());
        } catch (CityRegisterException e) {
            throw new RuntimeException(e);
        }

        AnswerCityRegister answerCityRegister = new AnswerCityRegister();
        return answerCityRegister;
    }
}
