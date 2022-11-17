package app1;

public class App2 {

    public static void main(String[] args) throws Exception {
        System.out.printf("Maximo de %d, %d %d y %d es %d%n%n",
                3, 4, 5, 6, maximo(3, 4, 5, 6));
        System.out.printf("Maximo de %.1f, %.1f, %.1f y %.1f es %.1f%n%n",
                6.6, 7.7, 8.8, 9.9, maximo(6.6, 7.7, 8.8, 9.9));
        System.out.printf("Maximo de %s, %s, %s y %s es %s%n%n",
                "pera", "zanahoria", "uva", "melocoton" , maximo("pera", "zanahoria", "uva", "melocoton"));
        System.out.printf("Minimo de %d, %d %d y %d es %d%n%n",
                3, 4, 5, 6, minimo(3, 4, 5, 6));
        System.out.printf("Minimo de %.1f, %.1f, %.1f y %.1f es %.1f%n%n",
                6.6, 7.7, 8.8, 9.9, minimo(6.6, 7.7, 8.8, 9.9));
        System.out.printf("Minimo de %s, %s, %s y %s es %s%n%n",
                "pera", "zanahoria", "uva", "melocoton" , minimo("pera", "zanahoria", "uva", "melocoton"));
    }

    public static <T extends Comparable<T>> T maximo(T x, T y, T z, T w) {
        T max = x;
        if (y.compareTo(x) > 0) {
            max = y;
        }
        if (z.compareTo(y) > 0) {
            max = z;
        }
        if (w.compareTo(z) > 0) {
            max = w;
        }

        return max;
    }
     public static <T extends Comparable<T>> T minimo(T x, T y, T z, T w) {
        T max = x;
        if (y.compareTo(x) < 0) {
            max = y;
        }
        if (z.compareTo(y) < 0) {
            max = z;
        }
        if (w.compareTo(z) < 0) {
            max = w;
        }

        return max;
    }
}


