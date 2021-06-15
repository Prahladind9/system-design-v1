package edu.prahlad.patterns2.basics.abstraction;

public class Main {
    public static void main(String[] args) {
        var mailService = new MailService();
        mailService.sendEmail();
    }
}
