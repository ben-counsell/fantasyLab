package Players;

import Equipment.Weapon;

public class Knight extends Player implements IFight {
    public Knight(int healthPoints, int attackDamage) {
        super(healthPoints, attackDamage);
        this.setWeapon(new Weapon("Longsword", 2));
    }
}
