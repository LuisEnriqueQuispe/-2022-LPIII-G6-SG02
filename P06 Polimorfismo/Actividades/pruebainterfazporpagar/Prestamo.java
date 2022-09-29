package pruebainterfazporpagar;

public class Prestamo implements PorPagar{
    private int numeroDeCuotas;
    private double montoDeCuota;

    public Prestamo(int NCuotas, double monto) {
        setNumeroDeCuotas(NCuotas); 
        setMontoDeCuota(monto); 
    }

    public int getNumeroDeCuotas() {
        return numeroDeCuotas;
    }

    public void setNumeroDeCuotas(int numeroDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
    }

    public double getMontoDeCuota() {
        return montoDeCuota;
    }

    public void setMontoDeCuota(double montoDeCuota) {
        this.montoDeCuota = montoDeCuota;
    }
    
    @Override
    public double getMontoPago()
    {
        return getNumeroDeCuotas() * getMontoDeCuota();
    }

    @Override
    public String toString() {
        return "Prestamo: \n" + 
               "numeroDeCuotas: " + numeroDeCuotas + "\n" +
               "montoDeCuota: " + montoDeCuota;
    }
    
    
}
