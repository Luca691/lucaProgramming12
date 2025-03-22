import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class deckOfCards {
    private ArrayList<card> deck;

    // Constructor that accepts a pre-existing deck
    public deckOfCards(ArrayList<card> deck) {
        this.deck = new ArrayList<>(deck);
    }

    // Default constructor that creates a standard deck of cards
    public deckOfCards() {
        List<String> suits = card.getValidSuits();
        List<String> faceNames = card.getValidFaceNames();
        deck = new ArrayList<>();

        for (String suit : suits) {
            for (String faceName : faceNames) {
                deck.add(new card(faceName, suit));
            }
        }
    }

    // Shuffle the deck
    public void shuffle() {
        Collections.shuffle(deck);
    }

    // Draw a hand of 7 cards
    public List<card> drawHand(int numCards) {
        if (deck.size() < numCards) {
            throw new IllegalStateException("Not enough cards left in the deck!");
        }

        List<card> hand = new ArrayList<>(deck.subList(0, numCards));
        deck.subList(0, numCards).clear(); 
        return hand;
    }
    public int getDeckSize() {
        return deck.size();
    }
   
    public void printDeck() {
        for (card card : deck) {
            System.out.println(card);
        }
    }
}
