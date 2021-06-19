package edu.prahlad.patterns2.command.useCase1.app2;

import edu.prahlad.patterns2.command.useCase1.framework.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white");
    }
}
