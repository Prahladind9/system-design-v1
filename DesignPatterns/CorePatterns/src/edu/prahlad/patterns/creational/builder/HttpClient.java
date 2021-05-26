package edu.prahlad.patterns.creational.builder;

public class HttpClient {

    private String method;
    private String url;
    private String userName;
    private String password;
    private String headers;
    private String body;

    public HttpClient(String method, String url, String userName, String password, String headers, String body) {
        this.method = method;
        this.url = url;
        this.userName = userName;
        this.password = password;
        this.headers = headers;
        this.body = body;
    }

    public HttpClient(HttpClientBuilder httpClientBuilder) {
        this.method = httpClientBuilder.method;
        this.url = httpClientBuilder.url;
        this.userName = httpClientBuilder.userName;
        this.password = httpClientBuilder.password;
        this.headers = httpClientBuilder.headers;
        this.body = httpClientBuilder.body;
    }

    @Override
    public String toString() {
        return "HttpClient{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", headers='" + headers + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public static class HttpClientBuilder{
        private String method;
        private String url;
        private String userName;
        private String password;
        private String headers;
        private String body;

        public HttpClientBuilder method(String method){
            this.method = method;
            return this;
        }

        public HttpClientBuilder url(String url){
            this.url = url;
            return this;
        }

        //... for all other details as well
        public HttpClient build(){
            return new HttpClient(this);
        }
    }
}
