
package appcontenedora;

public class Chocolates extends Goodies{
    private String atributo3;
    private String atributo4;

    public Chocolates(String atributo3, String atributo4, int id, String description, float price) {
        super(id, description, price);
        this.atributo3 = atributo3;
        this.atributo4 = atributo4;
    }

    public String getAtributo3() {
        return atributo3;
    }

    public void setAtributo3(String atributo3) {
        this.atributo3 = atributo3;
    }

    public String getAtributo4() {
        return atributo4;
    }

    public void setAtributo4(String atributo4) {
        this.atributo4 = atributo4;
    }
    
}
