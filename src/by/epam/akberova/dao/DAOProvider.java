package by.epam.akberova.dao;

import by.epam.akberova.bean.User;
import by.epam.akberova.dao.UserDAO;
import by.epam.akberova.dao.impl.StudentDAOImpl;
import by.epam.akberova.dao.impl.TrainerDAOImpl;
import by.epam.akberova.dao.impl.UserDAOImpl;
import by.epam.akberova.datasource.DataSource;

public class DAOProvider {
    private static final DAOProvider instance = new DAOProvider();
    private UserDAO userDAO = new UserDAOImpl();
    private StudentDAO studentDAO = new StudentDAOImpl();
    private TrainerDAO trainerDAO = new TrainerDAOImpl();

    public DAOProvider() {
    }

    public static DAOProvider getInstance() {
        return instance;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public StudentDAO getStudentDAO() {
        return studentDAO;
    }

    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public TrainerDAO getTrainerDAO() {
        return trainerDAO;
    }

    public void setTrainerDAO(TrainerDAO trainerDAO) {
        this.trainerDAO = trainerDAO;
    }
}
