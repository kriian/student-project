package ru.hehnev.studentorder.validator;

import ru.hehnev.studentorder.domain.register.AnswerCityRegister;
import ru.hehnev.studentorder.domain.register.CityRegisterCheckerResponse;
import ru.hehnev.studentorder.domain.StudentOrder;
import ru.hehnev.studentorder.exception.CityRegisterException;
import ru.hehnev.studentorder.validator.register.CityRegisterChecker;
import ru.hehnev.studentorder.validator.register.FakeCityRegisterChecker;

public class CityRegisterValidator {
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
            e.printStackTrace();
        }

        AnswerCityRegister answerCityRegister = new AnswerCityRegister();
        return answerCityRegister;
    }
}
