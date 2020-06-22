package edu.prahlad.casestudy.onlinebank.model;

public class CaseStudyException extends Exception{
    private static final long serialVersionUID = -3967924560045591185L;

    private String errorCode;
    private String language;

    public CaseStudyException(String errorCode, String language){
        this.errorCode = errorCode;
        this.language = language;
    }

    public CaseStudyException(String errorCode, String language, String message){
        super(message);
        this.errorCode = errorCode;
        this.language = language;
    }
}
