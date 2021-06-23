package edu.prahlad.patterns2.behavioural.visitor.prob;

import edu.prahlad.patterns2.behavioural.visitor.AnchorNode;
import edu.prahlad.patterns2.behavioural.visitor.HeadingNode;
import edu.prahlad.patterns2.behavioural.visitor.Operation;

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
