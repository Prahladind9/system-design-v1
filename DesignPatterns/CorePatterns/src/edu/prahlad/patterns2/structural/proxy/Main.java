package edu.prahlad.patterns2.structural.proxy;

public class Main {
    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for (var fileName: fileNames){
            //library.add(new EBookProxy(fileName));
            library.add(new LoggingEBookProxy(fileName));
        }

        library.openEbook("a");
        library.openEbook("b");
    }
}
