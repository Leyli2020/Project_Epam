package by.epam.akberova.controller.impl;

import by.epam.akberova.controller.Command;
import by.epam.akberova.service.ServiceException;
import by.epam.akberova.service.ServiceProvider;
import by.epam.akberova.service.UserService;

public class DeleteUser implements Command {
    @Override
    public String execute(String query) {
        String name = query;
        ServiceProvider serviceFactory = ServiceProvider.getInstance();
        UserService userService = serviceFactory.getUserService();

        String responce;
        try {
            userService.deleteUser(name);
            responce = "Success";
        } catch (ServiceException e) {
            e.printStackTrace();
            responce = "Failure";
        }
        return responce;
    }
}
