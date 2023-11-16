package ru.hehnev.studentorder.validator;

import ru.hehnev.studentorder.domain.CityRegisterCheckerResponse;
import ru.hehnev.studentorder.domain.Person;
import ru.hehnev.studentorder.exception.CityRegisterException;

public interface CityRegisterChecker {
    CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException;
}
