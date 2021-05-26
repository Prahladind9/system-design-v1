package edu.prahlad.patterns.behavioural.command.tv;

public class CommandOff implements Command{
    Television television;

    public CommandOff(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.off();
    }
}
