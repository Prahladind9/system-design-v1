package edu.prahlad.patterns2.structural.proxy;

public class LoggingEBookProxy implements EBook{
    private String fileName;
    private EBookReal eBook;

    public LoggingEBookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if(eBook == null) eBook = new EBookReal(fileName);

        System.out.println("Logging");
        eBook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
