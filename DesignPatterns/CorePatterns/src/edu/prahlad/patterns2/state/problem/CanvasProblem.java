package edu.prahlad.patterns2.state.problem;

import edu.prahlad.patterns2.state.soln.ToolType;

/**
 * What if we add another TollType?
 * We need to modify the code at many places &
 * the handling will be tedious process - instead follow state pattern
 */
public class CanvasProblem {
    private ToolType currentTool;

    public void mouseDown(){
        if(currentTool == ToolType.SELECTION){
            System.out.println("Selection Icon");
        }else if(currentTool == ToolType.BRUSH){
            System.out.println("Brush Icon");
        }else if(currentTool == ToolType.ERASER){
            System.out.println("Eraser Icon");
        }
    }

    public void mouseUp(){
        if(currentTool == ToolType.SELECTION){
            System.out.println("Draw dashed rectangle");
        }else if(currentTool == ToolType.BRUSH){
            System.out.println("Draw a line");
        }else if(currentTool == ToolType.ERASER){
            System.out.println("Erase something");
        }
    }

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }
}
