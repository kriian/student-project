package ru.hehnev.studentorder.validator.register;

import ru.hehnev.studentorder.domain.Adult;
import ru.hehnev.studentorder.domain.Child;
import ru.hehnev.studentorder.domain.register.CityRegisterCheckerResponse;
import ru.hehnev.studentorder.domain.Person;
import ru.hehnev.studentorder.exception.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterChecker {
    public static final String PASSPORT_SERIA_1000 = "1000";
    public static final String PASSPORT_SERIA_2000 = "2000";
    public static final String BAD_1 = "1001";
    public static final String BAD_2 = "2001";
    public static final String ERROR_1 = "1002";
    public static final String ERROR_2 = "2002";
    @Override
    public CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException {
        CityRegisterCheckerResponse response = new CityRegisterCheckerResponse();
        if (person instanceof Adult) {
            Adult adult = (Adult) person;
            if (PASSPORT_SERIA_1000.equals(adult.getPassportSeria()) || PASSPORT_SERIA_2000.equals(adult.getPassportSeria())) {
                response.setExisting(true);
                response.setTemporal(false);
            }
            if (BAD_1.equals(adult.getPassportSeria()) || BAD_2.equals(adult.getPassportSeria())) {
                response.setExisting(false);
            }
            if (ERROR_1.equals(adult.getPassportSeria()) || ERROR_2.equals(adult.getPassportSeria())) {
                throw new CityRegisterException("Fake error " + adult.getPassportSeria());
            }
        }
        if (person instanceof Child) {
            response.setExisting(true);
            response.setTemporal(true);
        }
        System.out.println(response);
        return response;
    }

}
