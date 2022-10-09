package javaapplication20;


public class Edificio implements ImpactoEcologico {

    String TipoEdificio;
    double Basura;
    double Desechoquimico;
    double CosumoElectronico;
    double factor_emision = 0.5;

    public Edificio(String Edificio, double Residuos, double Energia, double Agua) {
        TipoEdificio = Edificio;
        Basura = Residuos;
        Desechoquimico = Energia;
        CosumoElectronico = Agua;
    }

    public String getTipoEdificio() {
        return TipoEdificio;
    }

    public double getResiduosSolidos() {
        return Basura;
    }

    public double getDesechoquimico() {
        return Desechoquimico;
    }

    public double getCosumoElectronico() {
        return CosumoElectronico;
    }

    public void setTipoEdificio(String Edificio) {
        TipoEdificio = Edificio;
    }

    public void setResiduosSolidos(double Residuos) {
        Basura = Residuos;
    }

    public void setConsumoEnergetico(double Energia) {
        Desechoquimico = Energia;
    }

    public void setCosumoElectronico(double Agua) {
        CosumoElectronico = Agua;
    }

    public double Dato_actividad(){
        return (getCosumoElectronico() * getResiduosSolidos()) + getDesechoquimico();
    }

    @Override
    public double ObtenerImpactoEcologico() {
        return Dato_actividad() * factor_emision;
    }


    @Override
    public String toString() {
        String s;
        s = "\n" +
                "-Datos Ecologicos de los "+ this.TipoEdificio  + "\n" +
                "  Contaminante: " + this.TipoEdificio+ "\n" +
                "  Consumo electrico: " + this.CosumoElectronico + "\n" +
                "  Cantidad de Basura desechada: " + this.Basura+ "\n" +
                "  Desechos quimicos: " + this.Desechoquimico + "\n"+
                "  Impacto Ecologico: " + this.ObtenerImpactoEcologico() + "\n";
        return s;
    }

}