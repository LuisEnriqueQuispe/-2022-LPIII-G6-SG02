
package testfile;
import java.io.*;
public class Serial5 {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Alumno a;
        Fecha f;
        
        try{
            fos = new FileOutputStream("C:\\Users\\user\\Downloads\\fichero\\alumnos.dat");
            salida = new ObjectOutputStream(fos);
            f = new Fecha(5,9,2011);
            a = new Alumno("12345678A","Lucas Gonzales", 20, f);
            salida.writeObject(a);
            f = new Fecha(7,9,2011);
            a = new Alumno("98765432B","Anacleto Jimenez", 19, f);
            salida.writeObject(a);
            f = new Fecha(8,9,2011);
            a = new Alumno("78234212Z","Maria Zapata", 21, f);
            salida.writeObject(a);
            
        }   catch(FileNotFoundException e) {
                System.out.println(e.getMessage());
        }   catch(IOException e) {
                System.out.println(e.getMessage());
        }   finally {
                try{
                    if(fos != null) fos.close();
                    if(salida != null) salida.close();
                }   catch(IOException e) {
                        System.out.println(e.getMessage());
                }
        }
    }
    
}

class Alumno extends Persona{
    
    private Fecha fechaMatricula;
    
    public Alumno(String nif, String nombre, int edad, Fecha fechaMatricula) {
        super(nif, nombre, edad);
        this.fechaMatricula = new Fecha();
        setFechaMatricula(fechaMatricula);
    }
    
    public Alumno() {
        
    }
    
    public Fecha getFechaMatricula() {
        return fechaMatricula;
    }
    
    public void setFechaMatricula(Fecha fechaMatricula) {
        this.fechaMatricula.setDia(fechaMatricula.getDia());
        this.fechaMatricula.setMes(fechaMatricula.getMes());
        this.fechaMatricula.setAño(fechaMatricula.getAño());
    }
}

class Fecha implements Serializable{
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    public Fecha(){
        
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
}

class Persona implements Serializable{
    private String nif;
    private String nombre;
    private int edad;
    
    public Persona() {
        
    }

    public Persona(String nif, String nombre, int edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

