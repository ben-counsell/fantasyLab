package Players;

import Equipment.Weapon;
import NPCs.Creature;
import NPCs.EnemyCreature;
import NPCs.SummonedCreature;
import Players.Abilities.Spell;

import java.util.ArrayList;
import java.util.Arrays;

public class Wizard extends Player implements ICast {
    private ArrayList<Spell> spells;
    private SummonedCreature summonedCreature;
    public Wizard(int healthPoints, int attackDamage) {
        super(healthPoints, attackDamage);
        Spell spell1 = new Spell("Acid Splash", 30);
        Spell spell2 = new Spell("Ray of Frost", 60);
        this.spells = new ArrayList<Spell>(
                Arrays.asList(spell1, spell2)
        );
        this.summonedCreature = new SummonedCreature("Golden Fish", 10, 5);
        this.setWeapon(new Weapon("Staff", 1));
    }

    public SummonedCreature getSummonedCreature() {
        return summonedCreature;
    }

    public void castSpell(Spell spell, EnemyCreature enemy) {
        enemy.takeDamage(spell.getDamage());
    }

    public ArrayList<Spell> getSpells() {
        return this.spells;
    }

    public void addSpell(Spell spell) {
        this.spells.add(spell);
    }

    public void summonNewCreature(SummonedCreature newSummonedCreature) {
        this.summonedCreature = newSummonedCreature;
    }
}
