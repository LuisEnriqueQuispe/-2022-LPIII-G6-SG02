package prograrectangulo;

public class Principal 
{
	public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(21,12);
        Manejador m1 = new Manejador();
        System.out.println("Area del rectangulo = " + Manejador.Area(r1));
        System.out.println("Perimetro del rectangulo = " +Manejador.Perimetro(r1));
            Manejador.MoverX(r1, 6);
            Manejador.MoverY(r1, 3);
            System.out.println(r1.toString());
            Manejador.crearRectanguloDosCoordenadas();
            Manejador.crearRectanguloUnaCoordenada();
	}
}