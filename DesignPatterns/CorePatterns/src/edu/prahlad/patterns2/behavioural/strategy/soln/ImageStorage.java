package edu.prahlad.patterns2.behavioural.strategy.soln;

public class ImageStorage {

    public void store(String fileName, Compressor compressor, Filter filter){
       compressor.compress(fileName);
       filter.apply(fileName);
    }
}
