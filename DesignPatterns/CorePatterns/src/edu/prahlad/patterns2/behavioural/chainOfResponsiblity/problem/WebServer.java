package edu.prahlad.patterns2.behavioural.chainOfResponsiblity.problem;

public class WebServer {
    public void handle(HttpRequest request){
        //Authentication
        var authenticator = new Authenticator();
        //Logging
        //Compression

    }
}
