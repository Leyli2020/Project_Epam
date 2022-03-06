package by.epam.akberova.view;

import by.epam.akberova.service.ServiceException;

import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class TrainerMenu {
    public static void TrainerMenuInit() throws ServiceException {
        while (true) {
            System.out.println("Hi!\n" +
                    "1. Show all students\n" +
                    "2. Add student\n" +
                    "3. Exit");
            Scanner managerChoiceScanner = new Scanner(System.in);
            int managerChoice = managerChoiceScanner.nextInt();
            switch (managerChoice) {
                case 1: {
                    UserMenu.show();
                }
                case 2: {
                    UserMenu.delete();
                }
                case 3:
                    Menu.Init();
                default:
                    System.out.println("Wrong input");
            }
        }
    }
}
