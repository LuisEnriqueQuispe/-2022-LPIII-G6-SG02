
package appcontenedora;


public class Biscuits extends Goodies{
    private String atributo1;
    private String atributo2;

    public Biscuits(String atributo1, String atributo2, int id, String description, float price) {
        super(id, description, price);
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }

    

    public String getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    public String getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }
    
    
}
