package ru.hehnev.studentorder;

import ru.hehnev.studentorder.domain.Address;
import ru.hehnev.studentorder.domain.Adult;
import ru.hehnev.studentorder.domain.Child;
import ru.hehnev.studentorder.domain.StudentOrder;

import java.time.LocalDate;

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
        studentOrder.setMarriageCertificateId("" + (123456000 + id));
        studentOrder.setMarriageDate(LocalDate.of(2016, 7, 4));
        studentOrder.setMarriageOffice("Отдел ЗАГС");
        Address address = new Address("195000", "Заневский пр.", "12", "", "142");
        // Муж
        Adult husband = new Adult("Петров", "Виктор", "Сергеевич", LocalDate.of(1997, 8, 24));
        husband.setPassportSeria("" + (1000 + id));
        husband.setPassportNumber("" + (100000 + id));
        husband.setIssueDate(LocalDate.of(2017, 9, 15));
        husband.setIssueDepartment("Отдел милиции №" + id);
        husband.setStudentId("" + (100000 + id));
        husband.setAddress(address);
        // Жена
        Adult wife = new Adult("Петрова", "Вероника", "Алекссевна", LocalDate.of(1998, 3, 12));
        wife.setPassportSeria("" + (2000 + id));
        wife.setPassportNumber("" + (200000 + id));
        wife.setIssueDate(LocalDate.of(2018, 4, 5));
        wife.setIssueDepartment("Отдел милиции №" + id);
        wife.setStudentId("" + (200000 + id));
        wife.setAddress(address);
        // Ребенок
        Child child = new Child("Петрова", "Ирина", "Викторовна", LocalDate.of(2018, 6, 29));
        child.setCertificateNumber("" + (300000 + id));
        child.setIssueDate(LocalDate.of(2018, 7, 19));
        child.setIssueDepartment("ОТдел ЗАГС №" + id);
        child.setAddress(address);

        studentOrder.setHusband(husband);
        studentOrder.setWife(wife);
        studentOrder.setChild(child);
        return studentOrder;
    }
}
