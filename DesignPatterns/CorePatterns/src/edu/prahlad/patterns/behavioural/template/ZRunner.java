package edu.prahlad.patterns.behavioural.template;

import edu.prahlad.patterns.behavioural.template.computerManufacturer.ComputerManufacturer;
import edu.prahlad.patterns.behavioural.template.computerManufacturer.DesktopManufacturer;
import edu.prahlad.patterns.behavioural.template.computerManufacturer.LaptopManufacturer;
import edu.prahlad.patterns.behavioural.template.dataRenderer.CSVDataRenderer;
import edu.prahlad.patterns.behavioural.template.dataRenderer.DataRenderer;
import edu.prahlad.patterns.behavioural.template.dataRenderer.XMLDataRenderer;

public class ZRunner {

    public static void main(String[] args) {
        DataRenderer renderer = new XMLDataRenderer();
        renderer.render();

        new CSVDataRenderer().render();

        ComputerManufacturer manufacturer = new DesktopManufacturer();
        manufacturer.buildComputer();

        new LaptopManufacturer().buildComputer();
    }
}
