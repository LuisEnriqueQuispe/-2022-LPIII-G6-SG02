package contadortest;

public class Contador {
    static int acumulador;
    final static int VALOR_INICIAL=10;
    private int valor;
    static int nContadores;
    static int ultimoContador;
    
    static public int acumulador() {
        return acumulador;
    }

    public Contador(int valor) {
        this.valor = valor;
        acumulador += valor;
        nContadores ++;
        ultimoContador = this.valor;
    }    
    
    public Contador(){
        this(Contador.VALOR_INICIAL);
    }

    public void inc() {
       this.valor++;
       acumulador++;
    }
    
    public int getValor(){
        return this.valor;
    }
    
}
