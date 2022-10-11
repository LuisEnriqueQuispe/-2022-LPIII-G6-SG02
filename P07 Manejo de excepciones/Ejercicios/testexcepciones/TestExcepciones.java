package testexcepciones;

import java.io.IOException;

class ExcepcionDeVocal extends Exception {
}
class ExcepcionDeNumero extends Exception {
}
class ExcepcionDeBlanco extends Exception {
}
class ExcepcionDeSalida extends Exception {
}
public class TestExcepciones {
  
        LeerEntrada en = new LeerEntrada(System.in);

    public void procesar() throws ExcepcionDeVocal, ExcepcionDeBlanco, ExcepcionDeSalida, ExcepcionDeNumero 
    {
        
        char ch;
        try {
            ch = Character.toUpperCase(en.getChar());
        } catch (IOException x) {
            System.out.println("Se ha producido una IOException.");
            return;
        }
        switch (ch) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                throw new ExcepcionDeVocal();
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case '0':
                throw new ExcepcionDeNumero();
            case ' ':
                throw new ExcepcionDeBlanco();
            case 'X':
                throw new ExcepcionDeSalida();
        }
    }

    public static void main(String args[]) {
        
        TestExcepciones Prueba = new TestExcepciones();
        boolean fin = false;
        do {
            try {
                Prueba.procesar();
            } catch (ExcepcionDeVocal x) {
                System.out.println("Excepcion de vocal.");
            } catch (ExcepcionDeNumero x) {
                System.out.println("Excepcion de numero.");
            } catch (ExcepcionDeBlanco x) {
                System.out.println("Excepcion de blanco.");
            } catch (ExcepcionDeSalida x) {
                System.out.println("Excepcion de salida.");
                fin = true;
            }
        } while (!fin);
        System.out.println("Finalizo programa.\n");
    } 
} 


           
       
