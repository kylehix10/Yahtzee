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

    

}
