package edu.prahlad.patterns2.behavioural.command.useCase2;

import edu.prahlad.patterns2.behavioural.command.useCase2.editor.BoldCommand;
import edu.prahlad.patterns2.behavioural.command.useCase2.editor.History;
import edu.prahlad.patterns2.behavioural.command.useCase2.editor.HtmlDocument;
import edu.prahlad.patterns2.behavioural.command.useCase2.editor.UndoCommand;

public class Main {
    public static void main(String[] args) {
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
