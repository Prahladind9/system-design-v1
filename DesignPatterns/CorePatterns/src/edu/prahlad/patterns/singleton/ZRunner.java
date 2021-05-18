package edu.prahlad.patterns.singleton;

import java.io.*;

public class ZRunner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //DateUtil dateUtil = new DateUtil(); // won't work
        DateUtil dateUtil1 = DateUtil.getInstance();
        DateUtil dateUtil2 = DateUtil.getInstance();
        System.out.println(dateUtil1);
        System.out.println(dateUtil2);
        System.out.println(dateUtil1 == dateUtil2);


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                "./resources/singleton/dateUtil.ser"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                     "./resources/singleton/dateUtil.ser"));

        ) {
            DateUtilThreadSafeSerialized dateUtilTS1 = DateUtilThreadSafeSerialized.getInstance();
            oos.writeObject(dateUtilTS1);
            DateUtilThreadSafeSerialized dateUtilTS2 = (DateUtilThreadSafeSerialized) ois.readObject();
            System.out.println(dateUtilTS1);
            System.out.println(dateUtilTS2);
        }


        Logger logger = Logger.getInstance();
        logger.log("Hello");
    }
}