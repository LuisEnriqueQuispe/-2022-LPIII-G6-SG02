package main;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese temperatura");
        Double miTemp = s1.nextDouble();
        System.out.println("Ingrese peso");
        Double miPeso = s1.nextDouble();
        System.out.println("Ingrese edad");
        Integer miEdad = s1.nextInt();
        Perro Fido = new Perro();
        Perro Pelusa = new Perro();
        
        Fido.increEdad(2);
        Pelusa.increEdad(5);
        Diagnostico Fido1 = new Diagnostico();
        
        Fido.setTemp(miTemp);
        Fido.setEdad(miEdad);
        Fido.peso = miPeso;
        
        Fido1.aptoVacuna(1, 1, 1);

    }

}