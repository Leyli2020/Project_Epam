package by.epam.akberova.dao.impl;

import by.epam.akberova.bean.Student;
import by.epam.akberova.dao.StudentDAO;
import by.epam.akberova.datasource.DataSource;

import java.util.List;
import java.util.Optional;

public class StudentDAOImpl implements StudentDAO {
    DataSource<Student> dataSource = new DataSource<>();

    @Override
    public void add(Student newStudent) {
        dataSource.getStudents().add(newStudent);
    }

    @Override
    public List<Student> getStudentList() {
        return dataSource.getStudents();
    }

    @Override
    public Optional<Student> getByName(String name) {
        return dataSource.getStudents().stream().
                filter(p -> p.getName().equals(name)).
                findFirst();
    }

    @Override
    public void deleteStudent(Student student) {
        dataSource.getStudents().removeIf(p -> p.equals(student));
    }
}
