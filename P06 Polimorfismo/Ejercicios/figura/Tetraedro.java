package figura;

public class Tetraedro extends FiguraTri{
    Tetraedro(double a) 
    {
        lado1 = a;
    }
    public double getArea() 
    {
        return Math.sqrt(3) * lado1 * lado1;
    }
    public double getVolumen() 
    {
        return (Math.sqrt(2) / 12)* lado1 * lado1 * lado1;
    }
}

