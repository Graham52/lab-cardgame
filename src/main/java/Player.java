public class Player {

    private Card hand;
    private int score;
    private String name;

    public Player(int score, String name){
        this.score = score;
        this.name = name;
    }

    public void setHand(Card card){
        this.hand = card;
    }

    public Card getHand() {
        return hand;
    }
}
