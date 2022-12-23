package projeucak;

public class Bilgiler {

    private int B=500;
    private int C=700;
    private int D=900;

    private double birimFiyat=0.10;

    public Bilgiler() {
    }

    public Bilgiler(int b, int c, int d) {
        B = b;
        C = c;
        D = d;
    }

    public int getB() {
        return B;
    }

    public int getC() {
        return C;
    }

    public int getD() {
        return D;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }
}
