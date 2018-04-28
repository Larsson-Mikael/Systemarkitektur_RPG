package Item;

import java.util.Random;

public abstract class Weapon {

    int baseAttack;
    float blockChance;


    public Weapon(int maxAttack, int minAttack) {
        Random rand = new Random();

        this.baseAttack = rand.nextInt(maxAttack + 1 - minAttack) + minAttack;
        this.blockChance = rand.nextFloat();
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public float getBlockChance() {
        return blockChance;
    }

}

