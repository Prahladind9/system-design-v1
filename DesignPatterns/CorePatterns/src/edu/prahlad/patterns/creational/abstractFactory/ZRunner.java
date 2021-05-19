package edu.prahlad.patterns.creational.abstractFactory;

import edu.prahlad.patterns.creational.abstractFactory.dao.DaoAbstractFactory;
import edu.prahlad.patterns.creational.abstractFactory.dao.DaoFactoryProducer;

public class ZRunner {
    public static void main(String[] args) {
        DaoAbstractFactory daf = DaoFactoryProducer.produce("db");
        daf.createDao("dept").save();
    }
}
