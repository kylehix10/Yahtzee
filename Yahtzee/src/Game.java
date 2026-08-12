public class Game {

    private ScoreCard scoreCard;
    private Dice dieOne;
    private Dice dieTwo;
    private Dice dieThree;
    private Dice dieFour;
    private Dice dieFive;

    private int score;

    public Game() {
        this.scoreCard = new ScoreCard();
        this.dieOne = new Dice();
        this.dieTwo = new Dice();
        this.dieThree = new Dice();
        this.dieFour = new Dice();
        this.dieFive = new Dice();
        this.score = 0;
    }

    public int lowerCardScore(){
        int lowerCardScore = 0;
        lowerCardScore += scoreCard.getLowerCard().get("ThreeOfAKind");
        lowerCardScore += scoreCard.getLowerCard().get("FourOfAKind");
        lowerCardScore += scoreCard.getLowerCard().get("FullHouse");
        lowerCardScore += scoreCard.getLowerCard().get("SmallStraight");
        lowerCardScore += scoreCard.getLowerCard().get("LargeStraight");
        lowerCardScore += scoreCard.getLowerCard().get("Yahtzee");
        lowerCardScore += scoreCard.getLowerCard().get("Chance");

        if(lowerCardScore >= 63)
            lowerCardScore += 35;

        return lowerCardScore;
    }

    public int upperCardScore(){
        int upperCardScore = 0;
        upperCardScore += scoreCard.getUpperCard().get("One");
        upperCardScore += scoreCard.getUpperCard().get("Twos");
        upperCardScore += scoreCard.getUpperCard().get("Threes");
        upperCardScore += scoreCard.getUpperCard().get("Fours");
        upperCardScore += scoreCard.getUpperCard().get("Fives");
        upperCardScore += scoreCard.getUpperCard().get("Sixes");

        return upperCardScore;
    }

    public int getScore(){
        score = this.lowerCardScore() + this.upperCardScore();
        return score;
    }

    

}
