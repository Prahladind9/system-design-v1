package edu.prahlad.patterns2.structural.proxy;

public class EBookProxy implements EBook{
    private String fileName;
    private EBookReal ebook;

    public EBookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if(ebook == null) ebook = new EBookReal(fileName);

        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
