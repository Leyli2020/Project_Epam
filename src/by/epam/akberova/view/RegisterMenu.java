package by.epam.akberova.view;

import by.epam.akberova.controller.CommandName;
import by.epam.akberova.controller.Controller;
import by.epam.akberova.service.ServiceException;

import java.util.Scanner;

public class RegisterMenu {
    public static void Registration() throws ServiceException {
        Scanner registrationScanner = new Scanner(System.in);
        System.out.println("Welcome to creating your account!\n" +
                "Name:");
        String name = registrationScanner.nextLine();
        System.out.println("Role:");
        String role = registrationScanner.nextLine();
        System.out.println("Hi, " + name + "! Create login and password!");
        System.out.println("Login:\n");
        String login = registrationScanner.nextLine();
        System.out.println("Password:");
        String password = registrationScanner.nextLine();
        Controller controller = new Controller();
        controller.executeTask(CommandName.REGISTRATION + "_Login_" + login + "_Password_" + password);
        switch (role) {
            case "Trainer":
                TrainerMenu.TrainerMenuInit();
                break;
            case "Student":
                StudentMenu.StudentMenuInit();
                break;
            default:
        }
    }
}
