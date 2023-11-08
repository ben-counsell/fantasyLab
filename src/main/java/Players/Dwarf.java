package Players;

import Equipment.Weapon;

public class Dwarf extends Player implements IFight {
    public Dwarf(int healthPoints, int attackDamage) {
        super(healthPoints, attackDamage);
        this.setWeapon(new Weapon("Axe", 3));
    }
}
