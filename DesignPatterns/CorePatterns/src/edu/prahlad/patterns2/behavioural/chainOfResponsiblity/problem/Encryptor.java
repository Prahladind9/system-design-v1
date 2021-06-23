package edu.prahlad.patterns2.behavioural.chainOfResponsiblity.problem;

import edu.prahlad.patterns2.behavioural.chainOfResponsiblity.Handler;
import edu.prahlad.patterns2.behavioural.chainOfResponsiblity.HttpRequest;

public class Encryptor extends Handler {
    public Encryptor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Encryption");
        return false;
    }
}
