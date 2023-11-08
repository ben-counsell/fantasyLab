package NPCs;

public class SummonedCreature extends Creature {
    public SummonedCreature(String name, int healthPoints, int damage) {
        super(name, healthPoints, damage);
    }

    public void attack(EnemyCreature enemy) {
        enemy.takeDamage(this.getDamage());
    }
}
