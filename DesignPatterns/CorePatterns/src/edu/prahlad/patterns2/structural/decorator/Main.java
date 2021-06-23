package edu.prahlad.patterns2.structural.decorator;

public class Main {
    public static void main(String[] args) {
        storeCreditCard(
                new EncryptedCloudStream(
                        new CloudStream()));
    }


    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}