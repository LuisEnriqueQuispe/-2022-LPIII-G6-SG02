package pruebainterfazporpagar;

public class Factura implements PorPagar
{
    private String numeroPieza ;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String pieza, String descripcion, int cuenta, double precio) 
    {
        numeroPieza = pieza;
        descripcionPieza = descripcion;
        setCantidad(cuenta);
        setPrecioPorArticulo(precio);
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = precioPorArticulo;
    }

    @Override
    public double getMontoPago()
    {
        return getCantidad() * getPrecioPorArticulo();
    }

    @Override
    public String toString() {
        return "Factura: \n" + 
               "numeroPieza: " + numeroPieza + "\n" + 
               "cantidad: " + cantidad + "\n" +
               "precioPorArticulo: " + precioPorArticulo;
    }
}
