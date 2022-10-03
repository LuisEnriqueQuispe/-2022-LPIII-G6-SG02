package figura;

public abstract class FiguraTri extends Figuras 
{
    FiguraTri() 
    {
        tipo = "Tridimensional";
    }
    public abstract double getArea();
    public abstract double getVolumen();
}
