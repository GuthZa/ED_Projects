package ficha3;

public class Quadrado extends Figura{

    double l;

    public Quadrado(double l) {
        this.l = l;
    }

    @Override
    public double area() {
        return l * l;
    }
}
