package edu.prahlad.patterns2.visitor.prob;

import edu.prahlad.patterns2.visitor.AnchorNode;
import edu.prahlad.patterns2.visitor.HeadingNode;
import edu.prahlad.patterns2.visitor.Operation;

public class PlainTextOperation implements Operation {
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("text-heading");
    }

    @Override
    public void apply(AnchorNode heading) {
        System.out.println("text-anchor");
    }
}
