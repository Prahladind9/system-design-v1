package edu.prahlad.patterns2.structural.adapter.avaFilters;

import edu.prahlad.patterns2.structural.adapter.Filter;
import edu.prahlad.patterns2.structural.adapter.Image;

//Adapter Class - Composite Idea
public class CaramelFilter implements Filter {
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
