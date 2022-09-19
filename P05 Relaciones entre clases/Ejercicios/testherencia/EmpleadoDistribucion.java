package testherencia;

public class EmpleadoDistribucion extends Asalariado{
    
    private String region;

    public EmpleadoDistribucion(String region, String nombre, long dni, int diasdiasVacaciones, double salario) {
        super(nombre, dni, diasdiasVacaciones, salario);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String nueva_region) {
        this.region = nueva_region;
    }  
    @Override
    public String toString() {
        return "Empleado Distribucion" + "\n" + 
               "DNI: " + getDni() + "\n" +
               "Nombre: " + getNombre() + "\n" +
               "Vacaciones: " + getDiasVacaciones() + "      Zona: " + region + "\n" + 
               "Salario: " + getSalario()*110/100 + "\n";
    }
}
