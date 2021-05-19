package edu.prahlad.patterns.abstractFactory.dao;

public abstract class DaoAbstractFactory {
    public abstract Dao createDao(String type);
}
