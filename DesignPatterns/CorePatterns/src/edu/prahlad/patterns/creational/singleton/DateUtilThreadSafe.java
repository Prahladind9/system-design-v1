package edu.prahlad.patterns.creational.singleton;

public class DateUtilThreadSafe {
    private static volatile DateUtilThreadSafe instance;

    private DateUtilThreadSafe() {
    }

    public static DateUtilThreadSafe getInstance() {
        if (instance == null) {
            synchronized (DateUtilThreadSafe.class) { //class level lock - expensive
                if (instance == null)
                    instance = new DateUtilThreadSafe();
            }
        }

        return instance;
    }
}
