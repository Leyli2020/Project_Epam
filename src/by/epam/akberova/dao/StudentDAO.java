package by.epam.akberova.dao;

import by.epam.akberova.bean.Student;

import java.util.List;
import java.util.Optional;

public interface StudentDAO {
    void add(Student newStudent);

    List<Student> getStudentList();

    Optional<Student> getByName(String name);

    void deleteStudent(Student student);

}
