package by.epam.akberova.controller.impl;

import by.epam.akberova.bean.User;
import by.epam.akberova.controller.Command;
import by.epam.akberova.service.ServiceException;
import by.epam.akberova.service.ServiceProvider;
import by.epam.akberova.service.UserService;

public class SignIn implements Command {
    @Override
    public String execute(String request) {
        String login = request.split(",")[1],
                password = request.split(",")[2];

        ServiceProvider serviceProvider = ServiceProvider.getInstance();
        UserService userService = serviceProvider.getUserService();
        String response;
        try {
            response = userService.login(login, password);
        } catch (ServiceException exception) {
            response = exception.getMessage();
        }

        return response;
    }
}

