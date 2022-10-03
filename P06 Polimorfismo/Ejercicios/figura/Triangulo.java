package figura;

public class Triangulo extends FiguraBi 
{
    Triangulo(double b, double h) 
    {
        lado1 = b;
        lado2 = h;
    }
    public double getArea() 
    {
        return lado1 * lado2 / 2;
    }
}

