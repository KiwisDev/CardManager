package Cards;

public class Pokemon extends Card{
    private String element;
    private int force;

    public Pokemon(String element, int force) {
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
