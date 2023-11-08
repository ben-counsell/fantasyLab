package Rooms;

import Equipment.Equipment;
import Equipment.Weapon;

public abstract class Chest {
    public Equipment treasure;

    public Chest(Equipment treasure) {
        this.treasure = treasure;
    }

    public Equipment getTreasure() {
        return treasure;
    }

    public String openChest() {
        return this.treasure.getName();
    }

    public void emptyChest() {
        this.treasure = null;
    }

    public void swapWeapon(Weapon weapon) {
        this.treasure = weapon;
    }
}
