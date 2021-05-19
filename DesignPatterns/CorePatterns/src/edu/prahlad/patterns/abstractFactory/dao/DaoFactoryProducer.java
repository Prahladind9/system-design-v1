package edu.prahlad.patterns.abstractFactory.dao;

public class DaoFactoryProducer {
    public static DaoAbstractFactory produce(String factoryType){
        DaoAbstractFactory daoAbstractFactory = null;

        if(factoryType.equals("xml")){
            daoAbstractFactory = new XMLDaoFactory();
        }else if(factoryType.equals("db")){
            daoAbstractFactory = new DBDaoFactory();
        }

        return daoAbstractFactory;
    }
}
