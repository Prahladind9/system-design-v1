package edu.prahlad.patterns.singleton;

import java.io.Serializable;

public class DateUtilThreadSafeSerialized implements Serializable, Cloneable {

    private static final long serialVersionUID = 1l;
    private static volatile DateUtilThreadSafeSerialized instance;

    private DateUtilThreadSafeSerialized() {
    }

    public static DateUtilThreadSafeSerialized getInstance() {
        if (instance == null) {
            synchronized (DateUtilThreadSafeSerialized.class) { //class level lock - expensive
                if (instance == null)
                    instance = new DateUtilThreadSafeSerialized();
            }
        }

        return instance;
    }

    protected Object readResolve(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
