import ficha3.*;
import org.w3c.dom.css.Rect;

import java.util.Timer;

public class Main {

    //Ex1
    // -----------------------------------------------------------------------------------------------------------------------
    public static <T> boolean comp(T[] m, T chave) {
        int count = 0;

        for(T element : m) {
            if(element == chave) {
                count++;
            if (count > 1) return true;
            }
        }

        return false;
    }

    public static <T extends Comparable<T>> boolean comp2(T[] m, T chave) {
        for(T element : m) {
            if(element.compareTo(chave) == 0) return true;
        }
        return false;
    }

    public static int ex3a(Figura f1, Figura f2) {
        return f1.compareTo(f2);
    }

    public static int ex3b(Rect r, Comparable<? super Rect> c) {
        return c.compareTo(r);
    }

    public static <T> int ex3c(T t, Comparable<? super T> cmp) {
        return cmp.compareTo(t);
    }

    public static <T extends Comparable<T>> boolean search(T[] array, Comparable<? super T> chave) {
        for (T element : array) {
            if(chave.compareTo(element) < 0) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        //Ex 1
        // -----------------------------------------------------------------------------------------------------------------------
        String[] tab1 = { "Ana", "Joao", "Manel", "Manel", "Ze"};
        String chave = "Manel";

        Integer[] tab2 = { 1, 2, 3, 3 , 4, 5};
        Integer chave2 = 2;

        Double[] tab3 = { 1.0, 2.0, 3.0, 3.0 , 4.0, 5.0};
        Double chave3 = 3.0;

        System.out.println(chave + " encontra-se "+comp(tab1,chave));
        System.out.println(chave2 + " encontra-se "+comp(tab2, chave2));
        System.out.println(chave3 + " encontra-se "+comp(tab3, chave3));

        //Ex 2
        System.out.println(chave + " encontra-se "+comp2(tab1,chave));

        //Testar com outros tipos, tipo Integer
        //testar com double e float


        //Ex 3
       // -----------------------------------------------------------------------------------------------------------------------
        Comparable<Object> co = new Comparable<Object>() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };

        Comparable<Figura> cf = new Comparable<Figura>() {
            @Override
            public int compareTo(Figura o) {
                return 0;
            }
        };

        Comparable<Rect> cr = new Comparable<Rect>() {
            @Override
            public int compareTo(Rect o) {
                return 0;
            }
        };

        Retangulo r = new Retangulo(2,3);
        Triangulo t = new Triangulo(5,2);
        Quadrado q = new Quadrado(3);


        System.out.println(ex3a(r, t));
        System.out.println(ex3a(r, r));

        //Ex 4
        Integer[] m = {3,2,6,3};
        String[] n = {"Ada","Albino"};

        System.out.println(search(m,2));
        System.out.println(search(n,"Francisco"));
        System.out.println(search(tab1, chave));
        System.out.println(search(tab2, chave2));
        System.out.println(search(tab3, chave3));


        //Ex 4
        Ponto<Integer, Integer> p = new Ponto<>(3,4);
        Ponto<Number, Number> x = new Ponto<>(0,0);

        System.out.println(p);
        System.out.println(x);
        x.copy(p);
        System.out.println(x);

//        Ponto<String, Integer> erro = new Ponto<String, Integer>("Olá", 3);
    }
}
