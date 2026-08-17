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

            case 7:
                for(int value = 1; value <= 6; value++){
                    int count = 0;

                    if(dieOne.getValue() == value)
                        count++;
                    if(dieTwo.getValue() == value)
                        count++;
                    if(dieThree.getValue() == value)
                        count++;
                    if(dieFour.getValue() == value)
                        count++;
                    if(dieFive.getValue() == value)
                        count++;

                    if(count >= 3){
                        total = dieOne.getValue() + dieTwo.getValue() + dieThree.getValue() + dieFour.getValue() + dieFive.getValue();
                        break;
                    }
                }

                scoreCard.getLowerCard().put("ThreeOfAKind", total);
                break;
            case 8:
                for(int value = 1; value <= 6; value++){
                    int count = 0;

                    if(dieOne.getValue() == value)
                        count++;
                    if(dieTwo.getValue() == value)
                        count++;
                    if(dieThree.getValue() == value)
                        count++;
                    if(dieFour.getValue() == value)
                        count++;
                    if(dieFive.getValue() == value)
                        count++;

                    if(count >= 4){
                        total = dieOne.getValue() + dieTwo.getValue() + dieThree.getValue() + dieFour.getValue() + dieFive.getValue();
                        break;
                    }
                }

                scoreCard.getLowerCard().put("FourOfAKind", total);
                break;
            case 9:
                boolean hasPair = false;
                boolean hasThree = false;

                for(int value = 1; value <= 6; value++){
                    int count = 0;

                    if(dieOne.getValue() == value)
                        count++;
                    if(dieTwo.getValue() == value)
                        count++;
                    if(dieThree.getValue() == value)
                        count++;
                    if(dieFour.getValue() == value)
                        count++;
                    if(dieFive.getValue() == value)
                        count++;

                    if(count == 2)
                        hasPair = true;
                    if(count == 3)
                        hasThree = true;
                }

                if(hasPair && hasThree)
                    total = 25;

                scoreCard.getLowerCard().put("FullHouse", total);
                break;
            case 10:
                boolean hasOne = false;
                boolean hasTwo = false;
                boolean hasThreeValue = false;
                boolean hasFour = false;
                boolean hasFive = false;
                boolean hasSix = false;

                if(dieOne.getValue() == 1 || dieTwo.getValue() == 1 || dieThree.getValue() == 1 || dieFour.getValue() == 1 || dieFive.getValue() == 1)
                    hasOne = true;
                if(dieOne.getValue() == 2 || dieTwo.getValue() == 2 || dieThree.getValue() == 2 || dieFour.getValue() == 2 || dieFive.getValue() == 2)
                    hasTwo = true;
                if(dieOne.getValue() == 3 || dieTwo.getValue() == 3 || dieThree.getValue() == 3 || dieFour.getValue() == 3 || dieFive.getValue() == 3)
                    hasThreeValue = true;
                if(dieOne.getValue() == 4 || dieTwo.getValue() == 4 || dieThree.getValue() == 4 || dieFour.getValue() == 4 || dieFive.getValue() == 4)
                    hasFour = true;
                if(dieOne.getValue() == 5 || dieTwo.getValue() == 5 || dieThree.getValue() == 5 || dieFour.getValue() == 5 || dieFive.getValue() == 5)
                    hasFive = true;
                if(dieOne.getValue() == 6 || dieTwo.getValue() == 6 || dieThree.getValue() == 6 || dieFour.getValue() == 6 || dieFive.getValue() == 6)
                    hasSix = true;

                if((hasOne && hasTwo && hasThreeValue && hasFour)
                        || (hasTwo && hasThreeValue && hasFour && hasFive)
                        || (hasThreeValue && hasFour && hasFive && hasSix))
                    total = 30;

                scoreCard.getLowerCard().put("SmallStraight", total);
                break;
            case 11:
                boolean hasOneLarge = false;
                boolean hasTwoLarge = false;
                boolean hasThreeLarge = false;
                boolean hasFourLarge = false;
                boolean hasFiveLarge = false;
                boolean hasSixLarge = false;

                if(dieOne.getValue() == 1 || dieTwo.getValue() == 1 || dieThree.getValue() == 1 || dieFour.getValue() == 1 || dieFive.getValue() == 1)
                    hasOneLarge = true;
                if(dieOne.getValue() == 2 || dieTwo.getValue() == 2 || dieThree.getValue() == 2 || dieFour.getValue() == 2 || dieFive.getValue() == 2)
                    hasTwoLarge = true;
                if(dieOne.getValue() == 3 || dieTwo.getValue() == 3 || dieThree.getValue() == 3 || dieFour.getValue() == 3 || dieFive.getValue() == 3)
                    hasThreeLarge = true;
                if(dieOne.getValue() == 4 || dieTwo.getValue() == 4 || dieThree.getValue() == 4 || dieFour.getValue() == 4 || dieFive.getValue() == 4)
                    hasFourLarge = true;
                if(dieOne.getValue() == 5 || dieTwo.getValue() == 5 || dieThree.getValue() == 5 || dieFour.getValue() == 5 || dieFive.getValue() == 5)
                    hasFiveLarge = true;
                if(dieOne.getValue() == 6 || dieTwo.getValue() == 6 || dieThree.getValue() == 6 || dieFour.getValue() == 6 || dieFive.getValue() == 6)
                    hasSixLarge = true;

                if((hasOneLarge && hasTwoLarge && hasThreeLarge && hasFourLarge && hasFiveLarge)
                        || (hasTwoLarge && hasThreeLarge && hasFourLarge && hasFiveLarge && hasSixLarge))
                    total = 40;

                scoreCard.getLowerCard().put("LargeStraight", total);
                break;
            case 12:
                if(dieOne.getValue() == dieTwo.getValue()
                        && dieTwo.getValue() == dieThree.getValue()
                        && dieThree.getValue() == dieFour.getValue()
                        && dieFour.getValue() == dieFive.getValue())
                    total = 50;

                scoreCard.getLowerCard().put("Yahtzee", total);
                break;
            case 13:
                total = dieOne.getValue() + dieTwo.getValue() + dieThree.getValue() + dieFour.getValue() + dieFive.getValue();

                scoreCard.getLowerCard().put("Chance", total);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}








