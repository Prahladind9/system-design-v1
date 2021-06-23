package edu.prahlad.patterns2.behavioural.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
