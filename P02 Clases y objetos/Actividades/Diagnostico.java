package main;

/**
 *
 * @author Alumno
 */
public class Diagnostico {

 
    public void aptoVacuna(int temp, int edad, double peso) {
        if (temp > 37 && temp < 40) {
            if (edad > 1) {
                if (peso > 5) {
                    System.out.println("El perro esta sano");
                }
            }
        } else {
            System.out.println("El perro esta enfermo");
        }
    }
    
}