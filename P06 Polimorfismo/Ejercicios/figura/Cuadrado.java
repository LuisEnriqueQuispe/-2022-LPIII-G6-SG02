package figura;

public class Cuadrado extends FiguraBi
{
    Cuadrado(double l) 
    {
        lado1 = l;
    }
    public double getArea() 
    {
        return lado1 * lado1;
    }
}
