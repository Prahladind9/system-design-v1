package edu.prahlad.patterns.creational.abstractFactory.dao;

public abstract class DaoAbstractFactory {
    public abstract Dao createDao(String type);
}
