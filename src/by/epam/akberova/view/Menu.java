package by.epam.akberova.view;

import by.epam.akberova.service.ServiceException;

import java.util.Scanner;

import static java.lang.System.exit;

public class Menu {
    public static void Init() throws ServiceException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose action:\n" +
                "1. Login\n" +
                "2. Register\n" +
                "0. Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                LoginMenu.show();
            case 2:
                RegisterMenu.Registration();
            case 0:
                exit(0);
            default:
                System.out.println("Wrong input!");
        }
    }
}
