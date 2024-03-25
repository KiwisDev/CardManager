package Cards;

public class Pokemon extends Card{
    private String element;
    private int strength;

    public Pokemon(String name,String element, int strength) {
        super(name,CardType.POKEMON);
        this.element = element;
        this.strength = strength;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
