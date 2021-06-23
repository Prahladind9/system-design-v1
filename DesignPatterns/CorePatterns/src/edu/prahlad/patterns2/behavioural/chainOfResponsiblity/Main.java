package edu.prahlad.patterns2.behavioural.chainOfResponsiblity;

import edu.prahlad.patterns2.behavioural.chainOfResponsiblity.problem.Encryptor;

public class Main {
    public static void main(String[] args) {
        //pipeline: authenticate -> logger -> compressor
        fullPipeline();

        //modified pipeline: authenticate -> compressor -> encryptor
        var encryptor = new Encryptor(null);
        var compressor = new Compressor(encryptor);
        var authenticator = new Authenticator(compressor);
        var server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "1234"));
    }

    private static void fullPipeline() {
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);

        var server = new WebServer(authenticator);
//        server.handle(new HttpRequest("admin", "1234"));
        server.handle(new HttpRequest("-", "1234"));
        //if authentication fails - remaining chain will not pass through
    }
}
