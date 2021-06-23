package edu.prahlad.patterns2.visitor;

public interface Operation {
    void apply(HeadingNode heading);
    void apply(AnchorNode heading);
}
