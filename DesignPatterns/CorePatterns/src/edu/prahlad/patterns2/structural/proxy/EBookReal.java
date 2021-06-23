package edu.prahlad.patterns2.structural.proxy;

public class EBookReal implements EBook {
    private String fileName;

    public EBookReal(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load(){
        System.out.println("Loading the ebook " + fileName);
    }

    @Override
    public void show(){
        System.out.println("Showing the ebook " + fileName);
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
