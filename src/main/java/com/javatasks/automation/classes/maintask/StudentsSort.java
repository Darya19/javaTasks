package com.javatasks.automation.classes.maintask;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;

public class StudentsSort {
Student[] students = new Student[20];

    public  void createMassive() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
      students =  mapper.readValue(new File("src/main/resources/students.json"), Student[].class);
   }

//  *вывод списка студентов заданного факультета
   public  void assignedFacultyList(String faculty) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty().equals(faculty)) {
                System.out.println(students[i].toString());
            }
        }
    }

//   * вывод списка студентов старше заданного года
    public  void yearOfBirthday(int year) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getBirthday().getYear() > year ) {
                System.out.println(students[i].toString());
            }
        }
    }

//    * вывод списка учебной группы
    public  void groupList(int groupNumber) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGroupNumber() == groupNumber ) {
                System.out.println(students[i].toString());
            }
        }
    }

//      * вывод списка студентов каждого факультета и курса
    public  void facultyAndCourseList(String faculty, int course) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty().equals(faculty) && students[i].getCourse() == course)
                System.out.println(students[i].toString());

        }
    }
}
