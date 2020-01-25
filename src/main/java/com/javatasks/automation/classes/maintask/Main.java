package com.javatasks.automation.classes.maintask;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StudentsSort sort = new StudentsSort();
        sort.createMassive();
        sort.assignedFacultyList("economic");
        sort.yearOfBirthday(1999);
        sort.groupList(178);
        sort.facultyAndCourseList("mathematical", 3);
    }
}
