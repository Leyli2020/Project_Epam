package by.epam.akberova.view;

import by.epam.akberova.bean.Role;
import by.epam.akberova.controller.CommandName;
import by.epam.akberova.controller.Controller;
import by.epam.akberova.service.ServiceException;

import java.util.Scanner;

public class LoginMenu {
    public static void show() throws ServiceException {
        Controller controller = new Controller();
        final String USER = "1", STUDENT = "2", TRAINER = "3";

        Scanner loginScanner = new Scanner(System.in);
        System.out.println("1 - User, 2 - Student, 3 - Trainer\n");
        String role = loginScanner.nextLine();
        System.out.println("Login:\n");
        String login = loginScanner.next();
        System.out.println("Password:");
        String password = loginScanner.next();

        controller.executeTask(CommandName.SIGN_IN + "," + login + "," + password);
        switch (role) {
            case USER:
                UserMenu.show();
            case STUDENT:
                StudentMenu.StudentMenuInit();
            case TRAINER:
                TrainerMenu.TrainerMenuInit();
            default:
                throw new IllegalStateException("Unexpected value: " + role);
        }
    }
}
