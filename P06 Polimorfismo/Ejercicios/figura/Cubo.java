package figura;

public class Cubo extends FiguraTri{
    Cubo(double l) 
    {
        lado1 = l;
    }
    public double getArea() 
    {
        return 6 * lado1 * lado1;
    }
    public double getVolumen() 
    {
        return lado1 * lado1 * lado1;
    }
}
