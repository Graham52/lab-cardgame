import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Player player1;
    Card card;
    Deck deck;

    @Before
    public void before(){
        player = new Player(0,"Graham");
        player1 = new Player(0,"Natacha");
        card = new Card(Suit.HEARTS,Rank.FIVE);
    }

    @Test
    public void playerHasACardTest(){
        player.setHand(card);
        assertEquals(card , player.getHand());
    }

}
