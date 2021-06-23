package edu.prahlad.patterns2.structural.adapter.avaFilters;

import edu.prahlad.patterns2.structural.adapter.Filter;
import edu.prahlad.patterns2.structural.adapter.Image;

//Adapter Class - Inheritance Idea > not so flexible
public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
