package by.epam.akberova.service;

import by.epam.akberova.bean.Student;

import java.util.List;

public interface TrainerService {
    void addStudent(Student student);

    List<Student> showStudentList();

    void deleteStudent(Student student);
}
