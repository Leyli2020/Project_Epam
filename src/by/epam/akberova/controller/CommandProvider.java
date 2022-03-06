package by.epam.akberova.controller;

import by.epam.akberova.controller.impl.*;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider() {
        repository.put(CommandName.SIGN_IN, new SignIn());
        repository.put(CommandName.REGISTRATION, new Registration());
        repository.put(CommandName.SHOW_MANAGERS, new ShowManagers());
        repository.put(CommandName.DELETE_USER, new DeleteUser());
    }

    Command getCommand(String commandName) {
        String capsCommandName = commandName.toUpperCase(Locale.ROOT);
        Command command = repository.get(capsCommandName);
        return command;
    }
}
