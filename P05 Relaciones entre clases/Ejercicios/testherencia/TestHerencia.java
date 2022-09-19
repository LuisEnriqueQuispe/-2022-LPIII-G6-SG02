package testherencia;

public class TestHerencia {

    public static void main(String[] args) {
        Asalariado empleado1 = new Asalariado ("Manuel Cortina", 12345678, 28, 3000);
        EmpleadoProduccion empleado2 = new EmpleadoProduccion("noche", "Juan Mota", 55333222, 30, 1500);
        EmpleadoDistribucion empleado3 = new EmpleadoDistribucion("Granada", "Antonio Camino", 55333666, 35, 3500);
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
    }
} 
