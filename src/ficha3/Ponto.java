package ficha3;

public class Ponto<A extends Number, B extends Number>{
    private A p1;
    private B p2;
    public Ponto(A x, B y) {
        this.p1 = x;
        this.p2 = y;
    }

    public void copy(Ponto<? extends A, ? extends B> p) {
        p1 = p.p1; p2 = p.p2;
    }

    @Override
    public String toString() {
        return "Ponto {" +
                "x=" + p1 +
                ", y=" + p2 +
                '}';
    }
}
