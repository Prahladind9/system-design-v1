package edu.prahlad.patterns2.behavioural.mediator.base;

public class UIControl {
    protected DialogBox owner;

    public UIControl(DialogBox owner) {
        this.owner = owner;
    }
}
