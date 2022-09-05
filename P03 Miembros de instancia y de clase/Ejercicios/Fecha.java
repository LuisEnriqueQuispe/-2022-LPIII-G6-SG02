package fecha;
import java.util.*;
        
public class Fecha
{
    int dia;
    int mes; 
    int anio; 
    Scanner s1 = new Scanner(System.in);
    protected int[] diasporMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    protected int[] diasAcumulados = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 };
    protected int[] diasAcumuladosEnBisiesto = { 0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335 };
    
    public Fecha() {
        this(1,1,1900);
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }
  
     public void leer() {
        System.out.println("Ingresa el dia: ");
        this.dia = s1.nextInt();
        System.out.println("Ingresa el mes: ");
        this.mes = s1.nextInt();
        System.out.println("Ingresa el año: ");
        this.anio = s1.nextInt();
        valida();
    }
    
    public boolean bisiesto() {
        return this.bisiesto(this.anio);
    }
    
    public boolean bisiesto(int anio) {
        return (anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0);
    }
    
    public int diasMes(int mes) {
        int dias = diasporMes[mes - 1];
        if (bisiesto() && mes == 2) dias++;
        return dias; 
    }

    private void valida() {
        if (!(this.anio >= 1900 && this.anio <= 2050)) this.anio = 1900;
        if (!(this.mes > 0 && this.mes <= 12)) this.mes = 1;
        if (!(this.dia <= this.diasMes(this.mes))) this.dia = 1;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String corta() {
        String formato = this.dia + "-" + this.mes + "-" + this.anio;
        System.out.println(formato);
        return formato;
    }

    public int diasTranscurridos() {
        Fecha fecha = new Fecha(1, 1, 1900);
        return this.diasEntre(fecha);
    }
    
    public String diaSemana() {
        String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
        String diaDeLaSemana = dias[this.diasTranscurridos() % 7];
        return diaDeLaSemana;
    }

    public String larga() {
        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre" };
        String formato = String.format("%s %d de %s de %d", this.diaSemana(), this.dia, meses[this.mes - 1], this.anio);
        System.out.println(formato);
        return formato;
    }

    public void fechaTras(long dias) {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
        while(dias > 0) {
            this.siguiente();
            dias--;
        }
    }

    public int diasEntre(Fecha fecha) {
        return Math.abs(this.diferenciaEntreFechas(fecha));
    }
    
    public void siguiente() {
        if (this.dia == diasMes(this.mes)) {
            this.dia = 1;
            if (this.mes == 12) {
                this.mes = 1;
                this.anio++;
            } else {
                this.mes++;
            }
        } else {
            this.dia++;
        }
    }

    public void anterior() {
        if (this.dia == 1) {
            if (this.mes == 1) {
                this.dia = 31;
                this.mes = 12;
                this.anio--;
            } else {
                this.dia = 31;
                this.mes--;
            }
        } else {
            this.dia--;
        }
    }

    public Fecha copia() {
	return new Fecha(this.anio, this.mes, this.dia);
    }

    public boolean igualQue(Fecha fecha) {
        return (this.anio == fecha.anio && this.mes == fecha.mes && this.dia == fecha.dia);
    }
    
    public boolean menorQue(Fecha fecha){
        return this.diferenciaEntreFechas(fecha) < 0;
    }

    public boolean mayorQue(Fecha fecha){
        return this.diferenciaEntreFechas(fecha) > 0;
    }

    private int diferenciaDelOrigen(int dia, int mes, int anio) {
        int dias;
        if (this.bisiesto(anio)){
		anio--;
		int aniosBisiestos = anio / 4 - anio / 100 + anio / 400;
    		dias = anio * 365 + aniosBisiestos + diasAcumuladosEnBisiesto[mes - 1] + dia - 1;
        } else {
		anio--;
		int aniosBisiestos = anio / 4 - anio / 100 + anio / 400;
    		dias = anio * 365 + aniosBisiestos + diasAcumulados[mes - 1] + dia - 1;
        }
        return dias;
    }

    private int diferenciaEntreFechas(Fecha fecha) {
        int diferencia1 = diferenciaDelOrigen(fecha.dia, fecha.mes, fecha.anio);
        int diferencia2 = diferenciaDelOrigen(this.dia, this.mes, this.anio);

        return diferencia2 - diferencia1;
    }

    public static void main(String[] args) {
        Fecha fecha1= new Fecha(); 
        fecha1.leer();
        fecha1.corta();
        fecha1.larga();       
    }    
}

