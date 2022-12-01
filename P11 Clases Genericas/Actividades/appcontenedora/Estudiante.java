
package appcontenedora;


public class Estudiante extends Persona{
    private String especialidad;
    private String departamento;
    private String provincia;

    public Estudiante(String especialidad, String departamento, String provincia, String nombre, String direccion, String telefono) {
        super(nombre, direccion, telefono);
        this.especialidad = especialidad;
        this.departamento = departamento;
        this.provincia = provincia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

     @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\n" + 
               "Direccion: " + getDireccion() + "\n" +
               "Telefono: " + getTelefono() + "\n" +
               "Especialidad: " + especialidad + "\n" +
               "Departamento: " + departamento + "\n" +
               "Provincia" + provincia + "\n";
    
    }
    
}
