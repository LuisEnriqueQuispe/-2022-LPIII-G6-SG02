package javaapplication11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class agenda_lp3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        boolean salir = false;
        int opcion;
        Agenda agendaTelefonica = new Agenda(3);
        String nombre;
        int telefono;
        Contacto c;
        while (!salir) {
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Modificar contactos");          
            System.out.println("4. Borrar contacto");
            System.out.println("5. Mostrar contactos");
            System.out.println("6. Salir");
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Escribe un nombre");
                        nombre = sn.next();
                        System.out.println("Escribe un telefono");
                        telefono = sn.nextInt();
                        c = new Contacto(nombre, telefono);
                        agendaTelefonica.aniadirContacto(c);
                        break;
                    case 2:
                        System.out.println("Escribe un nombre");
                        nombre = sn.next();
                        agendaTelefonica.buscarPorNombre(nombre);
                        break;
                    case 3:
                       
                        agendaTelefonica.listarContactos();
                        break;

                    case 4:
                        System.out.println("Ingrese nombre");
                        nombre = sn.next();
                        c = new Contacto(nombre, 0);
                        agendaTelefonica.borrarContacto(c);
                        break;
                    case 5:
                        System.out.println("Hay para mostrar " + agendaTelefonica.huecosLibre() + " contactos");
                        break;                   
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 8");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
}