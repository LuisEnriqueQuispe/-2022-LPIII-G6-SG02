package testherencia;

public class Asalariado {
    private String nombre;
    private long dni;
    private int diasVacaciones;
    private double salario;

    public Asalariado(String nombre, long dni, int diasVacaciones, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.diasVacaciones = diasVacaciones;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevo_nombre) {
        this.nombre = nuevo_nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long nuevo_dni) {
        this.dni = nuevo_dni;
    }

    public int getDiasVacaciones() {
        return diasVacaciones;
    }

    public void setDiasVacaciones(int nuevo_diasVacaciones) {
        this.diasVacaciones = nuevo_diasVacaciones;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado Asalariado" + "\n" + 
               "DNI: " + dni + "\n" +
               "Nombre: " + nombre + "\n" +
               "Vacaciones: " + diasVacaciones + "\n" + 
               "Salario: " + salario + "\n";
    }
    
}