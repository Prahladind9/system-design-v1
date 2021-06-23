package edu.prahlad.patterns2.behavioural.iterator;

public class BrowserHistoryWithArray {
    private String[] urls = new String[10];
    private int count = 0;

    public void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        return urls[--count];
    }

    public Iterator<String> createIterator(){
        return new ArrayIterator(this);
    }


    public class ArrayIterator implements Iterator<String>{

        private BrowserHistoryWithArray history;
        private int index;

        public ArrayIterator(BrowserHistoryWithArray history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
