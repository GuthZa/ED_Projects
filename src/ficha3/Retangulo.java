package ficha3;

public class Retangulo extends Figura {
    double h, w;
    public Retangulo(double h, double l) {
        this.h = h;
        this.w = l;
    }

    @Override
    public double area() {
        return this.w*h;
    }
}
