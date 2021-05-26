package edu.prahlad.patterns.behavioural.command.tv;

public class CommandOn implements Command{
    Television television;

    public CommandOn(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.on();
    }
}
