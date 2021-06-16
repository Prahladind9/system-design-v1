package edu.prahlad.patterns2.strategy.soln;

public class JPEGCompressor implements Compressor{
    @Override
    public void compress(String compress) {
        System.out.println("Compressing using JPEG");
    }
}
