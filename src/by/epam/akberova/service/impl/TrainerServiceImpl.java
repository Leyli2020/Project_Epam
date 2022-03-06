package by.epam.akberova.service.impl;

import by.epam.akberova.bean.Student;
import by.epam.akberova.dao.DAOProvider;
import by.epam.akberova.dao.StudentDAO;
import by.epam.akberova.service.TrainerService;

import java.util.List;

public class TrainerServiceImpl implements TrainerService {
    public DAOProvider daoProvider = new DAOProvider();
    StudentDAO studentDAO = daoProvider.getStudentDAO();

    @Override
    public void addStudent(Student student) {
        studentDAO.add(student);
    }

    @Override
    public List<Student> showStudentList() {
        return studentDAO.getStudentList();
    }

    @Override
    public void deleteStudent(Student student) {
        studentDAO.deleteStudent(student);
    }
}
