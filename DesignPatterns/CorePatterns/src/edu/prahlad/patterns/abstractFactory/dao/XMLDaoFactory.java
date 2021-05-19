package edu.prahlad.patterns.abstractFactory.dao;

public class XMLDaoFactory extends DaoAbstractFactory{
    @Override
    public Dao createDao(String type) {
        Dao dao = null;
        if(type.equals("emp")){
            dao = new XMLEmpDao();
        }else if(type.equals("dept")){
            dao = new XMLDepDao();
        }

        return dao;
    }
}
