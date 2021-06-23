package edu.prahlad.patterns2.behavioural.visitor.prob;

public class HeadingNode implements HtmlNode {
    @Override
    public void highlight() {
        System.out.println("highlight-heading");
    }
}
