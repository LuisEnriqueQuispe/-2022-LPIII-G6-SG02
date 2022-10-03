package figura;

public class Circulo extends FiguraBi 
{
    Circulo(double r) 
    {
        lado1 = r;
    }
    public double getArea() 
    {
        return Math.PI * lado1 * lado1;
    }
}

