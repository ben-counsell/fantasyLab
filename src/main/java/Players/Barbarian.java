package Players;

import Equipment.Weapon;

public class Barbarian extends Player implements IFight {
    public Barbarian(int healthPoints, int attackDamage) {
        super(healthPoints, attackDamage);
        this.setWeapon(new Weapon("Susan", 2));
    }
}
