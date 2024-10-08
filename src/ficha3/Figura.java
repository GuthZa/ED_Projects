package ficha3;

public abstract class Figura implements Comparable<Figura>{

    public abstract double area();

    @Override
    public int compareTo(Figura arg0) {
        double dif = area() - arg0.area();

        if (dif>0) return 1;
        if (dif<0) return -1;
        return 0;
    }
}