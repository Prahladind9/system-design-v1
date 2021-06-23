package edu.prahlad.patterns2.behavioural.visitor;

import edu.prahlad.patterns2.behavioural.visitor.prob.PlainTextOperation;

public class Main {
    public static void main(String[] args) {
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new HighlightOperation());
        document.execute(new PlainTextOperation());
    }
}
