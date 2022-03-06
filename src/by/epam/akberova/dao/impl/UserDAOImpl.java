package by.epam.akberova.dao.impl;

import by.epam.akberova.bean.User;
import by.epam.akberova.dao.DAOException;
import by.epam.akberova.dao.UserDAO;
import by.epam.akberova.datasource.DataSource;

import java.util.List;

public class UserDAOImpl implements UserDAO {
    public DataSource dataSource = new DataSource();


    @Override
    public boolean authorize(String login, String password) throws DAOException {
        return false;
    }

    @Override
    public void registration(User user) throws DAOException {
        dataSource.getUsers().add(user);
    }

    @Override
    public List<User> getAll() {
        return dataSource.getUsers();
    }

    @Override
    public User findUser(String name) {
        User user = new User();
        while (dataSource.getUsers().contains(user)) {
            if (user.getName().equals(name)) {
                break;
            }
        }
        return user;
    }

    @Override
    public void delete(String name) throws DAOException {
        dataSource.getUsers().remove(findUser(name));
    }
}
