package by.epam.akberova.utils;

import by.epam.akberova.bean.User;
import by.epam.akberova.service.ServiceException;

public interface UserValidator {
    boolean checkAuthData(User user) throws ServiceException;

    boolean checkRegData(User user) throws ServiceException;
}
