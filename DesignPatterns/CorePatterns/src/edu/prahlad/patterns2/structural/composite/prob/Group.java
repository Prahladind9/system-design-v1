package edu.prahlad.patterns2.structural.composite.prob;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Object> objects = new ArrayList<>();

    public void add(Object object){
        objects.add(object);
    }

    public void render(){
        for (var object: objects) {
         if(object instanceof Shape) {
             ((Shape) object).render();
         }else{
             ((Group) object).render();
         }

        }
    }
}
