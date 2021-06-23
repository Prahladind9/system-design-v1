package edu.prahlad.patterns2.behavioural.command.useCase1.app2;

import edu.prahlad.patterns2.behavioural.command.useCase1.framework.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
