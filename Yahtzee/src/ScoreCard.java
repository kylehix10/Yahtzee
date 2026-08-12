import java.util.HashMap;

public class ScoreCard {

    private final HashMap<String, Integer> upperCard;
    private final HashMap<String, Integer> lowerCard;

    public ScoreCard() {
        this.upperCard = new HashMap<>();
        this.lowerCard = new HashMap<>();

        upperCard.put("One", 0);
        upperCard.put("Twos", 0);
        upperCard.put("Threes", 0);
        upperCard.put("Fours", 0);
        upperCard.put("Fives", 0);

        lowerCard.put("ThreeOfAKind", 0);
        lowerCard.put("FourOfAKind", 0);
        lowerCard.put("FullHouse", 0);
        lowerCard.put("SmallStraight", 0);
        lowerCard.put("LargeStraight", 0);
        lowerCard.put("Yahtzee", 0);
        lowerCard.put("Chance", 0);
    }

    public HashMap<String, Integer> getUpperCard() {
        return upperCard;
    }

    public HashMap<String, Integer> getLowerCard() {
        return lowerCard;
    }
}