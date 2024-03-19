import Cards.Card;

import java.util.ArrayList;

public class Deck {
    ArrayList<Card> cardsList= new ArrayList<Card>();

    public void getAll(){
        cardsList.forEach((n)->System.out.println("Le nom est :"+n.getName()));
    }
}
