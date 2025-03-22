import java.util.List;

public class mainCard {
    public static void main(String[] args) {
        deckOfCards deck = new deckOfCards();

        // Shuffle the deck
        deck.shuffle();
        System.out.println("Deck shuffled!");

        // Draw a hand of 7 cards
        List<card> hand = deck.drawHand(7);
        System.out.println("Your hand:");
        for (card card : hand) {
            System.out.println(card);
        }

        // Show remaining cards in the deck
        System.out.println("Cards left in deck: " + deck.getDeckSize());
    }
}
