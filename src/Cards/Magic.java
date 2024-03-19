package Cards;

public class Magic extends Card{
    private int force;
    private int rang;
    private String couleur;

    public Magic(String name, CardType type, int force, int rang, String couleur) {
        super(name, type);
        this.force = force;
        this.rang = rang;
        this.couleur = couleur;
    }


    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getRang() {
        return rang;
    }

    public void setRang(int rang) {
        this.rang = rang;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
