package by.epam.akberova.service.impl;

import by.epam.akberova.bean.User;
import by.epam.akberova.dao.DAOException;
import by.epam.akberova.dao.DAOFactory;
import by.epam.akberova.dao.DAOProvider;
import by.epam.akberova.dao.UserDAO;
import by.epam.akberova.dao.impl.UserDAOImpl;
import by.epam.akberova.datasource.DataSource;
import by.epam.akberova.service.ServiceException;
import by.epam.akberova.service.UserService;


public class UserServiceImpl implements UserService {
    private final DAOProvider daoProvider = DAOProvider.getInstance();

    @Override
    public String login(String login, String password) throws ServiceException {
        if (login == null || login.isEmpty()) {
            throw new ServiceException("Incorrect login");
        }
        try {
            DAOFactory daoObjectFactory = DAOFactory.getInstance();
            UserDAO userDAO = daoObjectFactory.getUserDAO();
            userDAO.authorize(login, password);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
        return "Login";
    }

    @Override
    public void registrate(String login, String password) throws ServiceException {
        User user = new User(login, password);
        if (user.getName().equals("")) {
            throw new ServiceException("Wrong name");
        }
        try {
            DAOFactory daoObjectFactory = DAOFactory.getInstance();
            UserDAO userDAO = daoObjectFactory.getUserDAO();
            userDAO.registration(user);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public String showManagers() {
        return null;
    }

    @Override
    public void deleteUser(String name) throws ServiceException {
        DAOFactory daoObjectFactory = DAOFactory.getInstance();
        UserDAO userDAO = daoObjectFactory.getUserDAO();
        try {
            userDAO.delete(name);
        } catch (DAOException e) {
            e.printStackTrace();
        }
    }
}
