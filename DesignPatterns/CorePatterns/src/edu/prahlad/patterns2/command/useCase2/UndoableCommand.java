package edu.prahlad.patterns2.command.useCase2;

public interface UndoableCommand extends Command{
    void unexecute();
}
