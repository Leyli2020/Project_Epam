package by.epam.akberova.service;

public interface UserService {
    String login(String login, String password) throws ServiceException;

    void deleteUser(String name) throws ServiceException;

    void registrate(String login, String password) throws ServiceException;

    String showManagers();
}
