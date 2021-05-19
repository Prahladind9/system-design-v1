package edu.prahlad.patterns.abstractFactory;

import edu.prahlad.patterns.abstractFactory.dao.DaoAbstractFactory;
import edu.prahlad.patterns.abstractFactory.dao.DaoFactoryProducer;

public class ZRunner {
    public static void main(String[] args) {
        DaoAbstractFactory daf = DaoFactoryProducer.produce("db");
        daf.createDao("dept").save();
    }
}
