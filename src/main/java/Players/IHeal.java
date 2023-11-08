package Players;

import Equipment.HealingItem;

import java.util.ArrayList;

public interface IHeal {
    public ArrayList<HealingItem> getHealingItems();
    public void useHealingItem(HealingItem healingItem, Player player);
    public void addHealingItem(HealingItem healingItem);
    public void removeHealingItem(HealingItem healingItem);
}
