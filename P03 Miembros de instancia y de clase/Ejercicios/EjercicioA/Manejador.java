package prograrectangulo;

import java.util.Scanner;
public class Manejador 
{
	static void crearRectanguloDosCoordenadas()
	{
		int a;
		int b;
		Coordenada c1;
		Coordenada c2;
		Rectangulo r;
		System.out.println("Ingrese la esquina1 del rectangulo");
		System.out.print("X: ");
		a= (new Scanner(System.in)).nextInt();
		System.out.print("Y: ");
		b= (new Scanner(System.in)).nextInt();
		c1=new Coordenada(a,b);
		System.out.println("Ingrese la esquina2 del rectangulo");
		System.out.print("X: ");
		a= (new Scanner(System.in)).nextInt();
		System.out.print("Y: ");
		b= (new Scanner(System.in)).nextInt();
		c2=new Coordenada(a,b);
		r= new Rectangulo(c1,c2);
		System.out.println("Datos del rectangulo");
		System.out.println(r);
		System.out.print("Distancia de esquinas: " + r.getEsquina1().distancia(r.getEsquina2()));
	}
	static void crearRectanguloUnaCoordenada()
	{
		int a;
		int b;
		Coordenada c2;
		Rectangulo r;
		System.out.println("\n Ingrese la esquina2 del rectangulo");
		System.out.print("X: ");
		a= (new Scanner(System.in)).nextInt();
		System.out.print("Y: ");
		b= (new Scanner(System.in)).nextInt();
		c2=new Coordenada(a,b);
		r= new Rectangulo(c2);
		System.out.println("Datos del rectangulo");
		System.out.println(r);
		System.out.print("Distancia de esquinas: " + r.getEsquina1().distancia(r.getEsquina2()) + "\n");
	}
    public Manejador(){
    }
    public static double Area(Rectangulo c){
        double X;
        double Y;
        double X2;
        double Y2;
        double base;
        double ar = 0;
        double altu;
        X = c.getEsquina1().getX();
        Y = c.getEsquina1().getY();
        X2 = c.getEsquina2().getX();
        Y2 = c.getEsquina2().getY();
        base = Math.abs(X-X2);
        altu = Math.abs(Y2-Y);
        ar = base*altu;
        return ar;
    }
    public static double Perimetro (Rectangulo c){
        double X;
        double Y;
        double X2;
        double Y2;
        double per = 0;
        double ar = 0;
        double base;
        double altu;
        X = c.getEsquina1().getX();
        Y = c.getEsquina1().getY();
        X2 = c.getEsquina2().getX();
        Y2 = c.getEsquina2().getY();
        base = Math.abs(X-X2);
        altu = Math.abs(Y2-Y);
        per = 2*(base)+2*(altu);
        return per;
    }
    public static void MoverX(Rectangulo c, int cantidad){
        int X;
        int X2;
        X = c.getEsquina1().getX();
        X = X + cantidad;
        c.getEsquina1().setX(X);
        X2 = c.getEsquina2().getX();
        X2 = X2 + cantidad;
        c.getEsquina2().setX(X2);
    }
    public static void MoverY(Rectangulo c, int cantidad){
        int Y;
        int Y2;
        Y = c.getEsquina1().getY();
        Y2 = c.getEsquina2().getY();
        Y = Y + cantidad;
        Y2 = Y2 + cantidad;
        c.getEsquina1().setY(Y  );
        c.getEsquina2().setY(Y2);
    }
}

