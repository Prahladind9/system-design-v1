package edu.prahlad.patterns2.visitor.prob;

public class AnchorNode implements HtmlNode {
    @Override
    public void highlight() {
        System.out.println("highlight-anchor");
    }
}
