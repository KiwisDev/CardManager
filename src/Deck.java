import Cards.Card;
import Cards.CardType;

import java.util.ArrayList;

public class Deck {
    ArrayList<Card> cardsList= new ArrayList<Card>();

    public void getAll(){
        cardsList.forEach((n)->System.out.println("Le nom est :"+n.getName()));
    }

    public void getPokemon(){
        for(int i=0;i< cardsList.size();i++){
            if(cardsList.get(i).getType()== CardType.POKEMON){
                System.out.println("Le nom est : "+cardsList.get(i).getName());
            }
        }
    }

    public void getMagic(){
        for(int i=0;i< cardsList.size();i++){
            if(cardsList.get(i).getType()== CardType.MAGIC){
                System.out.println("Le nom est : "+cardsList.get(i).getName());
            }
        }
    }
}
