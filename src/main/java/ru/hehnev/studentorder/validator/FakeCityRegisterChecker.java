package ru.hehnev.studentorder.validator;

import ru.hehnev.studentorder.domain.Adult;
import ru.hehnev.studentorder.domain.CityRegisterCheckerResponse;
import ru.hehnev.studentorder.domain.Person;

public class FakeCityRegisterChecker implements CityRegisterChecker {
    @Override
    public CityRegisterCheckerResponse checkPerson(Person person) {
        if (person instanceof Adult) {
            System.out.println("Yes adult");
        }
        return null;
    }

}
