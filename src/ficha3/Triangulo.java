package ficha3;

public class Triangulo extends Figura{
    double w,h;
    public Triangulo(double h, double w) {
        this.w = w;
        this.h = h;
    }

    @Override
    public double area() {
        return (h*w)/2;
    }
}
