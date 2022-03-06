package by.epam.akberova.dao;

import by.epam.akberova.dao.impl.UserDAOImpl;

public class DAOFactory {
    private final UserDAO userDao = new UserDAOImpl();

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return Holder.INSTANCE;
    }

    public UserDAO getUserDAO() {
        return userDao;
    }

    private static class Holder {
        static final DAOFactory INSTANCE = new DAOFactory();
    }
}
