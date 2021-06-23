package edu.prahlad.patterns2.behavioural.mediator.observer;

import java.util.ArrayList;
import java.util.List;

public class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();
    public void addEventHandler(EventHandler eventHandler){
        eventHandlers.add(eventHandler);
    }

    protected void notifyEventHandlers(){
        for(var observer: eventHandlers)
            observer.handle();
    }
}
