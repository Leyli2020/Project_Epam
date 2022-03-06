package by.epam.akberova.controller.impl;

import by.epam.akberova.controller.Command;
import by.epam.akberova.service.ServiceException;
import by.epam.akberova.service.ServiceProvider;
import by.epam.akberova.service.UserService;


public class Registration implements Command {
    @Override
    public String execute(String request) {
        String name = request.split(",")[1];
        String login = request.split(",")[3];
        String password = request.split(",")[4];

        String response;

        ServiceProvider serviceFactory = ServiceProvider.getInstance();
        UserService userService = serviceFactory.getUserService();
        try {
            userService.registrate(login, password);
            response = "Welcome, " + name + " !";
        } catch (ServiceException e) {
            e.printStackTrace();
            response = "Registration failed";
        }
        return response;
    }
}
