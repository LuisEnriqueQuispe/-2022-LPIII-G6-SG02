/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Piero Chirinos
 */
public class Banco {


    private String nombre;
    private Persona clientes[];

    public Banco(String nombre) {
        this(nombre, 20);
    }

    public Banco(String nombre, int numcli) {
        this.nombre = nombre;
        this.clientes = new Persona[numcli];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona[] getClientes() {
        return clientes;
    }

    public void setClientes(Persona[] clientes) {
        this.clientes = clientes;
    }

    public void agregarCliente(Persona persona) {
        if (buscarCliente(persona)) {
            System.out.println("La persona ya esta registrada como cliente...");
        } else {
            int i;
            for (i = 0; i < this.clientes.length; i++) {
                if (this.clientes[i] == null) {
                    break;
                }
            }
            if (i >= this.clientes.length)
                System.out.println("No hay capacidad para mas clientes...");
            else
                this.clientes[i] = persona;
        }

    }
    public void darBajaCliente(Persona persona) {
        if (buscarCliente(persona)) {
            for (int i = 0; i < this.clientes.length; i++) {
                if (this.clientes[i] != null) {
                    if (this.clientes[i].equals(persona)) {
                        this.clientes[i] = null;
                        System.out.println("Se encontro la persona " + persona.getNombre() + " y se elimino de la lista");
                    }
                }
            }
        }
    }
    public boolean buscarCliente(Persona persona) {
        for (int i = 0; i < this.clientes.length; i++) {
            if (this.clientes[i] != null) {
                if (this.clientes[i].equals(persona)) {
                    System.out.println("Se encontro la persona " + persona.getNombre() + " en la posicion " + i + " de la lista");
                    return true;
                }
            }
        }
        return false;
    }
    @Override

    public String toString() {
        String s;
        s = "\n" +
        "--------------- Banco de Datos ---------------" + "\n"+
        "Banco: " + nombre + "\n"+ "\n";
        for (Persona persona : this.clientes) {
            if (persona != null) {
                s += persona + "\n";
            }
        }
        return s;
    }

}
