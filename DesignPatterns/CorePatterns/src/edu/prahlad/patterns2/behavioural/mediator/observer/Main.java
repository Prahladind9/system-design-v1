package edu.prahlad.patterns2.behavioural.mediator.observer;

public class Main {
    public static void main(String[] args) {
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();
    }
}
