package edu.prahlad.patterns2.behavioural.visitor;

public interface Operation {
    void apply(HeadingNode heading);
    void apply(AnchorNode heading);
}
