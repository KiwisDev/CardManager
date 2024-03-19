package Cards;

public class Magic extends Card{
    private int force;
    private int rang;
    private String couleur;


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
