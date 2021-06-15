package edu.prahlad.patterns2.basics.inheritancePolymorphism;

public class Main {
    public static void main(String[] args) {
        var textBox = new TextBox();
        textBox.enable();
        textBox.draw();

        drawUIControl(new CheckBox());
        drawUIControl(new TextBox());
    }

    public static void drawUIControl(UIControl control){
        control.draw();
    }
}
