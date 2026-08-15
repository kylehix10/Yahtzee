import java.util.Random;

public class Dice {
    private int value;

    public Dice() {
        this.value = 0;
    }

    public int Roll(){
        value = new Random().nextInt(6) + 1;
        return value;
    }

    public int getValue(){
        return this.value;
    }

    public String toString(){
        return String.valueOf(value);
    }

    

}
