import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public void setup() {
        Suit[] allsuits = Suit.values();
        Rank[] allranks = Rank.values();

        for (Suit suit : allsuits) {
            for (Rank rank : allranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public Deck() {
        cards = new ArrayList<>();
        setup();
    }

    public int countDeck() {
        return cards.size();
    }

    public void shuffleDeck(){
        Collections.shuffle(cards);
    }

    public Card selectCardFromDeck(){
        shuffleDeck();
        return cards.get(0);
    }
}
