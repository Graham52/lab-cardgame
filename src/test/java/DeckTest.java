import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private ArrayList<Card> cards;
    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void addCardToDeckTest(){
        assertEquals(52, deck.countDeck());
    }

}
