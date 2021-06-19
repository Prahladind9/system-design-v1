package edu.prahlad.patterns2.command.useCase2.editor;

import edu.prahlad.patterns2.command.useCase2.UndoableCommand;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<UndoableCommand> commands = new ArrayDeque<>();

    public void push(UndoableCommand command){
        commands.add(command);
    }

    public UndoableCommand pop(){
        return commands.pop();
    }

    public int size(){
        return commands.size();
    }

}
