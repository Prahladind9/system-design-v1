package edu.prahlad.patterns2.behavioural.visitor;

public class HighlightOperation implements Operation{
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("highlight-heading");
    }

    @Override
    public void apply(AnchorNode heading) {
        System.out.println("highlight-anchor");
    }
}
