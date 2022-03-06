package by.epam.akberova.view;

import by.epam.akberova.service.ServiceException;

import java.util.Scanner;

public class StudentMenu {
    public static void StudentMenuInit() throws ServiceException {
        while (true) {
            System.out.println("Hi!\n" +
                    "1. Show all trainers\n" +
                    "2. Delete trainer\n" +
                    "3. Exit");
            Scanner moderatorChoiceScanner = new Scanner(System.in);
            int moderatorChoice = moderatorChoiceScanner.nextInt();
            switch (moderatorChoice) {
                case 1:
                    UserMenu.show();
                    break;
                case 2:
                    UserMenu.delete();
                    break;
                case 3:
                    Menu.Init();
                    break;
                default:
                    System.out.println("Wrong input");
            }
        }
    }
}
