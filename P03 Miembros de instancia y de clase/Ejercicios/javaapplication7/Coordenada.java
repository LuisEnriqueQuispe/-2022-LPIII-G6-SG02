package prograrectangulo;

public class Coordenada 
{
	private int x;
	private int y;
	public Coordenada()
	{
		this.x=0;
		this.y=0;
	}
	public Coordenada(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public Coordenada(Coordenada c)
	{
		this.x=c.getX();
		this.y=c.getY();
	}
	public int getX() 
	{
		return x;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public int getY() 
	{
		return y;
	}
	public void setY(int y) 
	{
		this.y = y;
	}
	//metodo de instancia que calcula la distancia euclideana
	double distancia(Coordenada c)
	{
		return Math.sqrt((this.x-c.x)*(this.x-c.x)+(this.y-c.y)*(this.y-c.y));
	}
	public String toString()
	{
		return this.x+", "+this.y ;
	}
}
