package edu.prahlad.patterns2.structural.adapter;

import edu.prahlad.patterns2.structural.adapter.avaFilters.Caramel;
import edu.prahlad.patterns2.structural.adapter.avaFilters.CaramelFilter;

public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
