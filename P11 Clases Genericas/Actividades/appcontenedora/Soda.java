
package appcontenedora;

public class Soda extends Biscuits{
    private String atributo1a;
    private String atributo2a;

    public Soda(String atributo1a, String atributo2a, String atributo1, String atributo2, int id, String description, float price) {
        super(atributo1, atributo2, id, description, price);
        this.atributo1a = atributo1a;
        this.atributo2a = atributo2a;
    }

    public String getAtributo1a() {
        return atributo1a;
    }

    public void setAtributo1a(String atributo1a) {
        this.atributo1a = atributo1a;
    }

    public String getAtributo2a() {
        return atributo2a;
    }

    public void setAtributo2a(String atributo2a) {
        this.atributo2a = atributo2a;
    }
    
    
}
