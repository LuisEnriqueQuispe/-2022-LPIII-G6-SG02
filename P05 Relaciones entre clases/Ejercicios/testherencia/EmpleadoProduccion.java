package testherencia;

public class EmpleadoProduccion extends Asalariado{
    
    private String turno;

    public EmpleadoProduccion(String turno, String nombre, long dni, int diasdiasVacaciones, double salario) {
        super(nombre, dni, diasdiasVacaciones, salario);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String nuevo_turno) {
        this.turno = nuevo_turno;
    }   
    @Override
    public String toString() {
        return "Empleado Produccion" + "\n" + 
               "DNI: " + getDni() + "\n" +
               "Nombre: " + getNombre() + "\n" +
               "Vacaciones: " + getDiasVacaciones() + "      Turno: " + turno + "\n" + 
               "Salario: " + getSalario()*115/100 + "\n";
    }
}
