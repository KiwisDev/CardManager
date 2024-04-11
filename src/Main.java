import java.util.Scanner;

import Cards.Card;
import Cards.CardType;
import Cards.Magic;
import Cards.Pokemon;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static Deck deck = new Deck();

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("** --- CardManager --- **\n");
            System.out.println("1. Add card");
            System.out.println("2. Edit card");
            System.out.println("3. Delete card");
            System.out.println("4. Show all cards");
            System.out.println("5. Show all pokemons cards");
            System.out.println("6. Show all magics cards");
            System.out.println("7. Sort cards");
            System.out.println("8. Exit\n");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addCard();
                case 2 -> editCard();
                case 3 -> deleteCard();
                case 4 -> showAllCards();
                case 5 -> showAllPokemonsCards();
                case 6 -> showAllMagicsCards();
                case 7 -> deck.sortCard();
                case 8 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 8);

        scanner.close();
    }

    public static void addCard() {
        System.out.println("\n** --- Add card --- ***\n");
        String type;

        do {
            System.out.print("Type of card to add? (pokemon/magic): ");
            type = scanner.next();
            type = type.toLowerCase();

            if(type.equals("pokemon") || type.equals("magic")) {
                break;
            }
            else {
                System.out.println("Invalid type! Please enter again.");
            }
        } while(true);

        System.out.print("\nName: ");
        String name = scanner.next();
        System.out.print("Strength: ");
        int strength = scanner.nextInt();

        if(type.equals("pokemon")) {
            System.out.print("Element: ");
            String element = scanner.next();
            Pokemon pokemon = new Pokemon(name, element, strength);

            deck.addCard(pokemon);
        }
        else {
            System.out.print("Rank: ");
            int rank = scanner.nextInt();
            System.out.print("Color: ");
            String color = scanner.next();
            Magic magic = new Magic(name, strength, rank, color);

            deck.addCard(magic);
        }
    }

    public static void editCard() {
        System.out.println("\n** --- Edit card --- ***\n");

        System.out.print("Name of the card to edit : ");
        String name = scanner.next();

        Card card = deck.getCard(name);

        if(card == null) {
            System.out.println("Card not found!");
            return;
        }

        System.out.print("New name: ");
        String newName = scanner.next();
        card.setName(newName);

        if(card.getType() == CardType.POKEMON) {
            Pokemon pokemon = (Pokemon) card;

            System.out.print("New strength: ");
            int newStrength = scanner.nextInt();
            pokemon.setStrength(newStrength);

            System.out.print("New element: ");
            String newElement = scanner.next();
            pokemon.setElement(newElement);
        }
        else {
            Magic magic = (Magic) card;

            System.out.print("New rank: ");
            int newRank = scanner.nextInt();
            magic.setRank(newRank);

            System.out.print("New color: ");
            String newColor = scanner.next();
            magic.setColor(newColor);
        }
    }

    public static void deleteCard() {
        System.out.println("\n** --- Delete card --- ***\n");

        System.out.print("Name of the card to delete : ");
        String name = scanner.next();

        deck.deleteCard(name);
    }

    public static void showAllCards() {
        System.out.println("\n** --- Cards list --- ***\n");

        deck.getAll();
    }

    public static void showAllPokemonsCards() {
        System.out.println("\n** --- Pokemon cards list --- ***\n");

        deck.getPokemon();
    }

    public static void showAllMagicsCards() {
        System.out.println("\n** --- Magic cards list --- ***\n");

        deck.getMagic();
    }
}