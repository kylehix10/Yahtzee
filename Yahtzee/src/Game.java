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

    //Adding score totals
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

    //Marking each category
    public void Mark(int choice){
        int total = 0;

        switch (choice) {
            case 1:
                if(dieOne.getValue() == 1)
                    total += dieOne.getValue();
                if(dieTwo.getValue() == 1)
                    total += dieTwo.getValue();
                if(dieThree.getValue() == 1)
                    total += dieThree.getValue();
                if(dieFour.getValue() == 1)
                    total += dieFour.getValue();
                if(dieFive.getValue() == 1)
                    total += dieFive.getValue();

                scoreCard.getUpperCard().put("One",total);
                break;
            case 2:
                if(dieOne.getValue() == 2)
                    total += dieOne.getValue();
                if(dieTwo.getValue() == 2)
                    total += dieTwo.getValue();
                if(dieThree.getValue() == 2)
                    total += dieThree.getValue();
                if(dieFour.getValue() == 2)
                    total += dieFour.getValue();
                if(dieFive.getValue() == 2)
                    total += dieFive.getValue();
                
                scoreCard.getUpperCard().put("Twos",total);
                break;
            case 3:
                if(dieOne.getValue() == 3)
                    total += dieOne.getValue();
                if(dieTwo.getValue() == 3)
                    total += dieTwo.getValue();
                if(dieThree.getValue() == 3)
                    total += dieThree.getValue();
                if(dieFour.getValue() == 3)
                    total += dieFour.getValue();
                if(dieFive.getValue() == 3)
                    total += dieFive.getValue();
                
                scoreCard.getUpperCard().put("Threes",total);
                break;
            case 4:
                if(dieOne.getValue() == 4)
                    total += dieOne.getValue();
                if(dieTwo.getValue() == 4)
                    total += dieTwo.getValue();
                if(dieThree.getValue() == 4)
                    total += dieThree.getValue();
                if(dieFour.getValue() == 4)
                    total += dieFour.getValue();
                if(dieFive.getValue() == 4)
                    total += dieFive.getValue();

                scoreCard.getUpperCard().put("Fours",total);
                break;
            case 5:
                if(dieOne.getValue() == 5)
                    total += dieOne.getValue();
                if(dieTwo.getValue() == 5)
                    total += dieTwo.getValue();
                if(dieThree.getValue() == 5)
                    total += dieThree.getValue();
                if(dieFour.getValue() == 5)
                    total += dieFour.getValue();
                if(dieFive.getValue() == 5)
                    total += dieFive.getValue();

                scoreCard.getUpperCard().put("Fives",total);
                break;
            case 6:
                if(dieOne.getValue() == 6)
                    total += dieOne.getValue();
                if(dieTwo.getValue() == 6)
                    total += dieTwo.getValue();
                if(dieThree.getValue() == 6)
                    total += dieThree.getValue();
                if(dieFour.getValue() == 6)
                    total += dieFour.getValue();
                if(dieFive.getValue() == 6)
                    total += dieFive.getValue();

                scoreCard.getUpperCard().put("Sixes",total);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
