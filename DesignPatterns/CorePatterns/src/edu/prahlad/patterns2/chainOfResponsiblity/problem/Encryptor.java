package edu.prahlad.patterns2.chainOfResponsiblity.problem;

import edu.prahlad.patterns2.chainOfResponsiblity.Handler;
import edu.prahlad.patterns2.chainOfResponsiblity.HttpRequest;

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
