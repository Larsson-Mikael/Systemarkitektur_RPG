package Actor;

import Item.Treasure;
import Logic.Hit;
import Item.Weapon;


import java.util.ArrayList;

public interface Character {
    int hp = 100;
    int baseAttack = 10;
    ArrayList<Treasure> inventory = new ArrayList<>();

    public void attack(Character character, Hit hit);
    public void isBlocking();
    public Weapon getWeapon();


}
