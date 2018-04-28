package Item;

import java.util.Random;

public class Treasure {
    public static String[] types = {"Goblet", "Coin", "Crown"};
    String type;
    int value;

    public Treasure() {
        Random rand = new Random();
        type = types[rand.nextInt(1 + 1 - types.length) + types.length];
        this.value = rand.nextInt(10 + 1 - 2) + 2;
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

}
