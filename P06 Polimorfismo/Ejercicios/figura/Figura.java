package figura;
import java.text.*;
public class Figura extends Figuras{

    public Figuras[] figu = {new Circulo(5), new Cuadrado(7), 
        new Triangulo(8, 2), new Esfera(10), new Cubo(5), new Tetraedro(4)};
    public DecimalFormat formato = new DecimalFormat("##.##");
    private void mostrar() 
    {
        for (int i = 0; i < 6; i++)
        {
            System.out.println("\nEl objeto " + (i+1) + " es una " 
            + figu[i].getClass().getName() + " y es de tipo " + figu[i].tipo);
            if (figu[i].tipo == "Bidimensional")
            {
                System.out.println("Su area es: " + formato.format(figu[i].getArea()) + " cm2");
            }
            else 
            {
                System.out.println("Su area es: " + formato.format(figu[i].getArea()) + " cm2");
                System.out.println("Su volumen es: " + formato.format(figu[i].getVolumen()) + " cm3");
            }
        }
        
    }
    public static void main(String[] args) 
    {
        new Figura().mostrar();
    }
    
}
