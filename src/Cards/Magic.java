package Cards;

public class Magic extends Card{
    private int strength;
    private int rank;
    private String color;

    public Magic(String name, int strength, int rank, String color) {
        super(name, CardType.MAGIC);
        this.strength = strength;
        this.rank = rank;
        this.color = color;
    }


    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
