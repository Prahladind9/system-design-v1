package edu.prahlad.patterns2.chainOfResponsiblity;

public class WebServer {
    public void handle(HttpRequest request){
        //Authentication
        var autheicator = new Authenticator();
        //Logging
        //Compression

    }
}
