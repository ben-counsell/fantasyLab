package NPCs;

import Players.Player;

public class EnemyCreature extends Creature {
    public EnemyCreature(String name, int healthPoints, int damage) {
        super(name, healthPoints, damage);
    }

    public void attack(Player player) {
        player.takeDamage(this.getDamage());
    }
}
