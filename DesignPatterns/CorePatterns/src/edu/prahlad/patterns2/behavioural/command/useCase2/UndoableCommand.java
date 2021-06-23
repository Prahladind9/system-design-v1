package edu.prahlad.patterns2.behavioural.command.useCase2;

public interface UndoableCommand extends Command{
    void unexecute();
}
