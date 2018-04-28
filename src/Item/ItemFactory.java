package Item;

public class ItemFactory {

    public Weapon createWeapon(int type) {
        switch(type) {
            case 1 : return new Sword(6, 8);
            case 2 : return new Axe(4, 12);
            case 3 : return new Hammer(2, 20);
            default : throw new IllegalArgumentException();
        }
    }

    public Treasure createTreasure() {
        return new Treasure();
    }
}
