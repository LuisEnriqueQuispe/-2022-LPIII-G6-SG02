package javaapplication20;

public class Bicicleta implements ImpactoEcologico {

    String TipoBicicleta;

    double factor_emision = 0.05;
    double Emision_energia;
    double Salud;

    public Bicicleta(String Bicy, double Gas, double Energia, double salud) {
        
        Salud = salud;
        TipoBicicleta = Bicy;
        Emision_energia = Energia;

    }

    public String getTipoBicicleta() {
        return TipoBicicleta;
    }

    public double getEmision_energia() {
        return Emision_energia;
    }

    public double getSalud() {
        return Salud;
    }

    public void setTipoBicicleta(String Bicy) {
        TipoBicicleta = Bicy;
    }

    public void setEmision_energia(double Energia) {
        Emision_energia = Energia;
    }

    public void setSalud_personal(double Salud) {
        Salud = Salud;
    }

    public double Dato_actividad(){
        return ((getSalud()/100) * (getEmision_energia()/100)) - getEmision_energia();
    }
    
    @Override
    public double ObtenerImpactoEcologico() {
        return Dato_actividad() * factor_emision;
    }

    @Override
    public String toString() {
        String s;
        s = "\n" +
                "-Datos Ecologicos de las "+ this.TipoBicicleta + "\n" +
                "  Contaminante: " + this.TipoBicicleta+ "\n" +
                "  Consumo de agua: " + this.Salud + "\n" +
                "  Consumo energetico: " + this.Emision_energia+ "\n"+
                "  Impacto Ecologico: " + this.ObtenerImpactoEcologico() + "\n";
        return s;
    }

}