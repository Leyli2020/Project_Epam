package by.epam.akberova.controller;

import by.epam.akberova.bean.User;
import by.epam.akberova.service.ServiceException;

public interface Command {
    String execute(String query) throws ServiceException;
}
