package Players;

import Equipment.HealingItem;
import Equipment.Weapon;
import NPCs.Creature;
import NPCs.EnemyCreature;
import Players.Abilities.Spell;
import Rooms.Chest;

public abstract class Player {
    private int maxHealth;
    private int currentHealth;
    private final int baseAttackDamage;
    private Weapon weapon;

    public Player(int maxHealth, int attackDamage) {
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.baseAttackDamage = attackDamage;
        this.weapon = null;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getAttackDamage() {
        return this.baseAttackDamage;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void takeDamage(int damage) {
        this.currentHealth -= damage;
    }

    public void heal(int healingAmount) {
        if (this.currentHealth + healingAmount <= this.maxHealth) {
            this.currentHealth += healingAmount;
        } else {
            this.currentHealth = this.maxHealth;
        }
    }

    public int actualDamage() {
        return weapon.getDamageModifier() * this.baseAttackDamage;
    }

    public void attack(EnemyCreature enemy) {
        enemy.takeDamage(actualDamage());
    }

//    public String openChest(Chest chest) {
//        return chest.openChest();
//    }

//    public void takeTreasure(Chest chest) {
//        (chest.getTreasure() instanceof Weapon) ? setWeapon(chest.getTreasure()) :
//        chest.getTreasure() instanceof HealingItem ? );
//        chest.takeTreasure();
//        chest.emptyChest();
//    }
}
