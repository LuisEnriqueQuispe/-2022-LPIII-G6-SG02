package prograrectangulo;

public class Rectangulo 
{
	private Coordenada esquina1;
    private Coordenada esquina2;
    static int cont;
    public Rectangulo(Coordenada c1, Coordenada c2){
        this.esquina1 = c1;
        this.esquina2 = c2;
    }
    public Coordenada getEsquina1(){
        return esquina1;
    }
    public void setEsquina1(Coordenada esquina1) {
        this.esquina1 = esquina1;
    }
    public Coordenada getEsquina2(){
        return esquina2;
    }
    public void setEsquina2(Coordenada esquina2) {
        this.esquina2 = esquina2;
    }
    public Rectangulo(int alt , int bs) {
        this.esquina1 = new Coordenada(0,0);
        this.esquina2 = new Coordenada(bs,alt);
        cont++;
    }
    @Override
        public String toString() {
        return "Esquina_1 = " + esquina1 + ",Esquina_2 = " + esquina2+ '}';
    }
}