package javaapplication20;


public class Auto implements ImpactoEcologico {
    String TipoAuto;
    double factor_emision = 0.3;
    double Aceleracion;
    double EmisionCo2;
    double Gasolina; 
    public Auto(String Auto, double Emision, double Aceleracionto, double Gas) {
        TipoAuto = Auto;
        EmisionCo2 = Emision;
        Aceleracion = Aceleracionto;
        Gasolina = Gas;
    }
    public String getTipoAuto() {
        return TipoAuto;
    }
    public double getEmisionCo2() {
        return EmisionCo2;
    }
    public double getGasolina() {
        return Gasolina;
    }
    public void setTipoAuto(String Auto) {
        TipoAuto = Auto;
    }
    public void setEmisionCo2(double Emision) {
        EmisionCo2 = Emision;
    }
    public void setAceleracion(double Aceleracionto) {
        Aceleracion = Aceleracionto;
    }
    public void setGasolina(double Gas) {
        Gasolina = Gas;
    }
    public double Dato_actividad(){
        double Emisioncompleta;
        Emisioncompleta = getGasolina()+getEmisionCo2();
        setEmisionCo2(Emisioncompleta);
        return getEmisionCo2();
    }
    @Override
    public double ObtenerImpactoEcologico() {
        return Dato_actividad() * factor_emision;
    }
    @Override
    public String toString() {
        String s;
        s = "\n" +
                "-Datos Ecologicos de los "+ this.TipoAuto + "\n" +
                "  Contaminante: " + this.TipoAuto+ "\n" +
                "  CO2 "+ this.TipoAuto + ": " + this.EmisionCo2 + "\n"+
                "  Gasolina depositada: " + this.Gasolina+ "\n" +
                "  Impacto Ecologico: " + this.ObtenerImpactoEcologico() + "\n";
        return s;
    }

}
