package Players;

import Equipment.Weapon;
import NPCs.Creature;
import NPCs.EnemyCreature;
import NPCs.SummonedCreature;
import Players.Abilities.Spell;

import java.util.ArrayList;
import java.util.Arrays;

public class Warlock extends Player implements ICast {
    private ArrayList<Spell> spells;
    private SummonedCreature familiar;
    public Warlock(int healthPoints, int attackDamage) {
        super(healthPoints, attackDamage);
        Spell spell1 = new Spell("Eldritch Blast", 50);
        Spell spell2 = new Spell("Bone Chill", 30);
        this.spells = new ArrayList<Spell>(
                Arrays.asList(spell1, spell2)
        );
        this.familiar = new SummonedCreature("Undead Puppy", 10, 3);
        this.setWeapon(new Weapon("Staff", 1));
    }

    public SummonedCreature getFamiliar() {
        return familiar;
    }

    public void castSpell(Spell spell, EnemyCreature enemy) {
        enemy.takeDamage(spell.getDamage());
    }

    public ArrayList<Spell> getSpells() {
        return this.spells;
    } //TODO:this is also a bit suspicious

    public void addSpell(Spell spell) {
        this.spells.add(spell);
    }

    public void summonNewCreature(SummonedCreature newFamiliar) {
        this.familiar = newFamiliar;
    }
}
