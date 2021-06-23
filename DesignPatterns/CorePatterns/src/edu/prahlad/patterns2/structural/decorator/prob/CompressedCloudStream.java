package edu.prahlad.patterns2.structural.decorator.prob;

public class CompressedCloudStream extends CloudStream {

    @Override
    public void write(String data) {
        var compress = compress(data);
        super.write(compress);
    }

    private String compress(String data){
        return data.substring(0,5);
    }
}
