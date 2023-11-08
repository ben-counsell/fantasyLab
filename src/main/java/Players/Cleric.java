package Players;

import Equipment.HealingItem;
import Equipment.Weapon;

import java.util.ArrayList;
import java.util.Arrays;

public class Cleric extends Player implements IHeal {
    private ArrayList<HealingItem> healingItems;

    public Cleric(int healthPoints, int attackDamage) {
        super(healthPoints, attackDamage);
        HealingItem potion = new HealingItem("Potion", 10);
        HealingItem strongPotion = new HealingItem("Hi-Potion", 30);
        this.healingItems = new ArrayList<HealingItem>(
                Arrays.asList(potion, strongPotion)
        );
        this.setWeapon(new Weapon("Staff", 1));
    }

    public ArrayList<HealingItem> getHealingItems() {
        return this.healingItems;
    }

    public void useHealingItem(HealingItem healingItem, Player player) {
        player.heal(healingItem.getHealingAmount());
    }

    public void addHealingItem(HealingItem healingItem) {
        this.healingItems.add(healingItem);
    }

    public void removeHealingItem(HealingItem healingItem) {
        this.healingItems.remove(healingItem); //TODO: very suspicious
    }
}
