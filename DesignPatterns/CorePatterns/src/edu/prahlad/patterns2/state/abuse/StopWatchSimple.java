package edu.prahlad.patterns2.state.abuse;

public class StopWatchSimple {
    private boolean isRunning;
    public void click() {
        if(isRunning){
            isRunning = false;
            System.out.println("Stopping");
        }else{
            isRunning = true;
            System.out.println("Running");
        }
    }
}
