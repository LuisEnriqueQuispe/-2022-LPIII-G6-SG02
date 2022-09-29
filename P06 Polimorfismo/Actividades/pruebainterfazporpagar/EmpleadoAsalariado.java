package pruebainterfazporpagar;

public class EmpleadoAsalariado extends Empleado
{
    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) 
    {
        super(nombre, apellido, nss);
        setSalarioSemanal(salario);
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }
    
    @Override
    public double getMontoPago()
    {
        return getSalarioSemanal();
    }       

    @Override
    public String toString() {
        return "EmpleadoAsalariado: " + getPrimerNombre() + "\n" +
               "Numero de seguro Social: " + getNumeroSeguroSocial() + "\n" +
               "SalarioSemanal: " + salarioSemanal;
    }
    
    
}
