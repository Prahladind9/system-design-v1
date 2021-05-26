package edu.prahlad.patterns.creational.builder;

public class ZRunner {
    public static void main(String[] args) {
        //Not very efficient way - could be confusing
        HttpClient http = new HttpClient("", "", "",null, null, null);

        HttpClient httpClient = new HttpClient.HttpClientBuilder()
                .method("POST").url("testurl").build();
        System.out.println(httpClient);
    }
}
