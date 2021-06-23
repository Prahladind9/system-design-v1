package edu.prahlad.patterns2.behavioural.command.useCase2.editor;

import edu.prahlad.patterns2.behavioural.command.useCase2.Command;

public class UndoCommand implements Command {
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.size() > 0)
            history.pop().unexecute();
    }
}
