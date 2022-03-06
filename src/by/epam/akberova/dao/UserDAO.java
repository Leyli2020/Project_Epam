package by.epam.akberova.dao;

import by.epam.akberova.bean.User;;

import java.util.List;

public interface UserDAO {

    boolean authorize(String login, String password) throws DAOException;

    void registration(User user) throws DAOException;

    List<User> getAll();

    User findUser(String name);

    void delete(String name) throws DAOException;

}
