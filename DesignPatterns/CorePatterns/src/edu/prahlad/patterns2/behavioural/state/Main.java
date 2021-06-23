package edu.prahlad.patterns2.behavioural.state;

import edu.prahlad.patterns2.behavioural.state.abuse.StopWatch;
import edu.prahlad.patterns2.behavioural.state.abuse.StopWatchSimple;
import edu.prahlad.patterns2.behavioural.state.soln.Canvas;
import edu.prahlad.patterns2.behavioural.state.soln.SelectionTool;

public class Main {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        var stopWatchSimple = new StopWatchSimple();
        stopWatchSimple.click();
        stopWatchSimple.click();


        //Complicated structure
        var stopWatch = new StopWatch();
        stopWatch.click();
        stopWatch.click();
    }
}
