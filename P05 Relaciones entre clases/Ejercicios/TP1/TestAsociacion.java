/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Piero Chirinos
 */
public class TestAsociacion {
    public static void main(String[] args) {

        Banco bcp = new Banco("BCP");

        Persona Piero = new Persona(100203, "Piero", "Chirinos", 11234.0);
        Persona Martin = new Persona(466737, "Martin", "Perez",10050.0);
        Persona Juan = new Persona(537832, "Luis", "Quispe",3300);
        Persona Luis = new Persona(875313, "Juan", "Rojas",10000);
        Persona Carlos = new Persona(075643, "Carlos", "Paredes",70453);
        
        bcp.agregarCliente(Piero);
        bcp.agregarCliente(Martin);
        bcp.agregarCliente(Juan);
        bcp.agregarCliente(Luis);
        bcp.agregarCliente(Carlos);

        bcp.darBajaCliente(Martin);
        bcp.darBajaCliente(Luis);

        bcp.buscarCliente(Piero);
        bcp.buscarCliente(Carlos);
        
        System.out.println(bcp);
    }
}
