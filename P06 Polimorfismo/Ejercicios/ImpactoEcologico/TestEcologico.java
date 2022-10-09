package javaapplication20;

public class TestEcologico {

    public static void main(String[] args) {

        ImpactoEcologico[] ObjetosImpacto = new ImpactoEcologico[3];
        

        ObjetosImpacto[0] = new Auto("Autos", 150, 60, 13.678);
        ObjetosImpacto[1] = new Edificio("Edificios", 50, 60, 55);
        ObjetosImpacto[2] = new Bicicleta("Biclicletas", 0, 30, 120);
        
         for(ImpactoEcologico ObjetosActuales : ObjetosImpacto) 
       
        {
            System.out.printf( ObjetosActuales.toString());
        }
    }   
}
