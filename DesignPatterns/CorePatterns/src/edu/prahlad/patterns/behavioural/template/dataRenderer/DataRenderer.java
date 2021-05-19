package edu.prahlad.patterns.behavioural.template.dataRenderer;

public abstract class DataRenderer {
    public final void render() {
        final String data = readData();
        final String processedData = processData(data);
        System.out.println(processedData);
    }

    public abstract String readData();

    public abstract String processData(String data);
}
