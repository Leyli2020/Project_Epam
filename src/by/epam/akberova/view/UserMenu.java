package by.epam.akberova.view;

import by.epam.akberova.controller.CommandName;
import by.epam.akberova.controller.CommandProvider;
import by.epam.akberova.controller.Controller;
import by.epam.akberova.service.ServiceException;

import java.util.Scanner;

public class UserMenu {
    public static void show() throws ServiceException {
        Controller controller = new Controller();

        System.out.println();
    }

    public static void delete()  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of manager you want to delete:");
        String name = sc.nextLine();
        Controller controller = new Controller();
        controller.executeTask(CommandName.DELETE_USER + name);
    }
}


