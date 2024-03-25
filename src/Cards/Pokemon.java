package Cards;

public class Pokemon extends Card{
    private String element;
    private int force;

    public Pokemon(String name,String element, int force) {
        super(name,CardType.POKEMON);
        this.element = element;
        this.force = force;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }
}
