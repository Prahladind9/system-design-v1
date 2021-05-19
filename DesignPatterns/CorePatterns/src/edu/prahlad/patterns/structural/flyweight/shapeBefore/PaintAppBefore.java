package edu.prahlad.patterns.structural.flyweight.shapeBefore;

public class PaintAppBefore {
    public void render(int numberOfShapes){
        ShapeBefore[] shapeBefores = new ShapeBefore[numberOfShapes+1];
        for (int i = 1; i < numberOfShapes; i++) {
            //Every time new object is created
            if(i%2 ==0){
                shapeBefores[i] = new CircleBefore();
                (((CircleBefore) shapeBefores[i])).setRadius(i);
                (((CircleBefore) shapeBefores[i])).setLineColor("red");
                (((CircleBefore) shapeBefores[i])).setFillColor("white");
                shapeBefores[i].draw();
            }else{
                shapeBefores[i] = new RectangleBefore();
                (((RectangleBefore) shapeBefores[i])).setLength(i);
                (((RectangleBefore) shapeBefores[i])).setBreadth(i+i);
                (((RectangleBefore) shapeBefores[i])).setFillStyle("dotted");
                shapeBefores[i].draw();
            }
        }
    }
}
