package edu.prahlad.patterns2.structural.decorator;

public class CompressedCloudStream implements Stream {
    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var compress = compress(data);
        stream.write(compress);
    }

    private String compress(String data){
        return data.substring(0,5);
    }
}
