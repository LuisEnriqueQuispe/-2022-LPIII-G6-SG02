package figura;

public class Esfera extends FiguraTri 
{
    Esfera(double r) 
    {
        lado1 = r;
    }
    public double getArea() 
    {
        return 4 * Math.PI * lado1 * lado1;
    }
    public double getVolumen() 
    {
        return ((4 * Math.PI * lado1 * lado1 * lado1) / 3);
    }
}

