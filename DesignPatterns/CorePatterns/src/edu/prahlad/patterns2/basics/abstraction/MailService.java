package edu.prahlad.patterns2.basics.abstraction;

public class MailService {
    public void sendEmail(){
        connect();
        disconnect();
        //send email
        authenticate();
    }

    private void connect(){
        System.out.println("Connect");
    }

    private void disconnect() {
        System.out.println("Disconnect");
    }

    private void authenticate(){
        System.out.println("Authenticate");
    }
}
