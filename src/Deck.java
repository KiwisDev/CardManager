import Cards.Card;
import Cards.CardType;
import Cards.Magic;
import Cards.Pokemon;

import java.util.ArrayList;

public class Deck {
    private final ArrayList<Card> cardsList= new ArrayList<Card>();

    public void getAll(){
        cardsList.forEach((n)->System.out.println("The name is: "+n.getName()));
    }

    public void getPokemon(){
        for(int i=0;i< cardsList.size();i++){
            if(cardsList.get(i).getType()== CardType.POKEMON){
                System.out.println("The name is: "+cardsList.get(i).getName()+" and the strength is: "+((Pokemon)cardsList.get(i)).getStrength());
            }
        }
    }

    public void getMagic(){
        for(int i=0;i< cardsList.size();i++){
            if(cardsList.get(i).getType()== CardType.MAGIC){
                System.out.println("The name is: "+cardsList.get(i).getName()+" and the strength is: "+((Magic)cardsList.get(i)).getStrength());
            }
        }
    }

    public void addCard(Card card){
        cardsList.add(card);
    }

    public Card getCard(String name){
        for (Card card : cardsList) {
            if (card.getName().equals(name)) {
                return card;
            }
        }
        return null;
    }

    public void deleteCard(String name){
        for(int i=0;i< cardsList.size();i++){
            if(cardsList.get(i).getName().equals(name)){
                cardsList.remove(i);
                System.out.println("The card "+ name+" has been deleted.");
                return;
            }
        }
    }

    public void sortCard() {
        // Put Pokemon cards first and Magic cards last
        ArrayList<Card> pokemons = new ArrayList<>();
        ArrayList<Card> magics = new ArrayList<>();

        for (Card card : cardsList) {
            if (card.getType() == CardType.POKEMON) {
                pokemons.add(card);
            } else {
                magics.add(card);
            }
        }

        // Bubble sort the pokemons by strength
        for (int i = 0; i < pokemons.size(); i++) {
            for (int j = 0; j < pokemons.size() - i - 1; j++) {
                Pokemon pokemon1 = (Pokemon) pokemons.get(j);
                Pokemon pokemon2 = (Pokemon) pokemons.get(j + 1);

                if (pokemon1.getStrength() > pokemon2.getStrength()) {
                    pokemons.set(j, pokemon2);
                    pokemons.set(j + 1, pokemon1);
                }
            }
        }

        // Bubble sort the magics by strength
        for (int i = 0; i < magics.size(); i++) {
            for (int j = 0; j < magics.size() - i - 1; j++) {
                Magic magic1 = (Magic) magics.get(j);
                Magic magic2 = (Magic) magics.get(j + 1);

                if (magic1.getStrength() > magic2.getStrength()) {
                    magics.set(j, magic2);
                    magics.set(j + 1, magic1);
                }
            }
        }

        cardsList.clear();
        cardsList.addAll(pokemons);
        cardsList.addAll(magics);
    }
}
