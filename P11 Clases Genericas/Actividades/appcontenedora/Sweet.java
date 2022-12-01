
package appcontenedora;

public class Sweet extends Biscuits{
    private String atributo1b;
    private String atributo2b;

    public Sweet(String atributo1b, String atributo2b, String atributo1, String atributo2, int id, String description, float price) {
        super(atributo1, atributo2, id, description, price);
        this.atributo1b = atributo1b;
        this.atributo2b = atributo2b;
    }

    public String getAtributo1b() {
        return atributo1b;
    }

    public void setAtributo1b(String atributo1b) {
        this.atributo1b = atributo1b;
    }

    public String getAtributo2b() {
        return atributo2b;
    }

    public void setAtributo2b(String atributo2b) {
        this.atributo2b = atributo2b;
    }
    
    
}
