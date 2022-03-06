package by.epam.akberova.controller.impl;

import by.epam.akberova.controller.Command;
import by.epam.akberova.service.ServiceException;
import by.epam.akberova.service.ServiceProvider;
import by.epam.akberova.service.UserService;

public class ShowManagers implements Command {
    @Override
    public String execute(String query) throws ServiceException {
        ServiceProvider serviceFactory = ServiceProvider.getInstance();
        UserService userService = serviceFactory.getUserService();

        String response = null;
        response = userService.showManagers();
        return response;
    }
}
