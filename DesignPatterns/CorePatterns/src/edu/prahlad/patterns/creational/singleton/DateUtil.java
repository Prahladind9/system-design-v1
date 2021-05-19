package edu.prahlad.patterns.creational.singleton;

public class DateUtil {
    //Lazy Initialization (preferred)
    private static DateUtil instance;

    //Eager Initialization example 1
    //private static DateUtil instance = new DateUtil();

    //Eager Initialization example 2
    /*private static DateUtil instance;
    static {
        instance = new DateUtil();
    }*/


    private DateUtil(){
    }

    public static DateUtil getInstance(){
        //Lazy Initialization
        if(instance == null)
            instance = new DateUtil();

        return instance;
    }
}
