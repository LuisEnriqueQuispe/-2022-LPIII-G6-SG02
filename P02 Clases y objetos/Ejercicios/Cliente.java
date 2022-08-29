package cuenta;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] soles ) {
        
        Scanner sc = new Scanner(System.in);
        String nombre;
        double saldo, retiro, deposito, t, r;
        
        System.out.println("Ingrese el nombre del cliente");
        nombre = sc.nextLine();
        
        System.out.println("Ingrese el saldo de la cuenta");
        saldo = sc.nextDouble();
        
        System.out. println("El cliente " + nombre + " tiene un saldo de " + saldo);
        
       System.out.println("Ingrese el monto que desea depositar");
       deposito = sc.nextDouble();
       
       t = saldo + deposito;
       
       System.out. println("El cliente " + nombre + " tiene un nuevo saldo de " + t + " soles");
       
       System.out.println("Ingrese el monto que desea retirar");
       retiro = sc.nextDouble();
       
       r = t - retiro;
       
       System.out. println("El cliente" + nombre + "tiene un nuevo saldo de" + r + "soles");
          
    } 
    
}