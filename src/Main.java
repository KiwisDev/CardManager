import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

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
            System.out.println("7. Exit\n");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addCard();
                case 2 -> editCard();
                case 3 -> deleteCard();
                case 4 -> showAllCards();
                case 5 -> showAllPokemonsCards();
                case 6 -> showAllMagicsCards();
                case 7 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 7);

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
        System.out.print("Force: ");
        int force = scanner.nextInt();

        if(type.equals("pokemon")) {
            String element = scanner.nextLine();

            //TODO: Add pokemon card
        }
        else {
            String rank = scanner.nextLine();

            //TODO: Add magic card
        }
    }

    public static void editCard() {
        System.out.println("Edit card");
    }

    public static void deleteCard() {
        System.out.println("Delete card");
    }

    public static void showAllCards() {
        System.out.println("Show all cards");
    }

    public static void showAllPokemonsCards() {
        System.out.println("Show all pokemons cards");
    }

    public static void showAllMagicsCards() {
        System.out.println("Show all magics cards");
    }
}