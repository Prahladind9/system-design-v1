package edu.prahlad.patterns2.state;

import edu.prahlad.patterns2.state.abuse.StopWatch;
import edu.prahlad.patterns2.state.abuse.StopWatchSimple;
import edu.prahlad.patterns2.state.soln.Canvas;
import edu.prahlad.patterns2.state.soln.SelectionTool;

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
