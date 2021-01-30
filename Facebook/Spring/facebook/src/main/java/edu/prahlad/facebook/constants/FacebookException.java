package edu.prahlad.facebook.constants;

public class FacebookException extends Exception{


    private String errorCode;
    private String language;

    public FacebookException(String errorCode){
        this.errorCode = errorCode;
    }
    public FacebookException(String errorCode, String language) {
        this.errorCode = errorCode;
        this.language = language;
    }

    public FacebookException(String errorCode, String language, String message) {
        super(message);
        this.errorCode = errorCode;
        this.language = language;
    }

    public FacebookException(String errorCode, String language, Exception exception) {
        super(exception);
        this.errorCode = errorCode;
        this.language = language;
    }

    public String getErrorCode(){
        return this.errorCode;
    }
}
