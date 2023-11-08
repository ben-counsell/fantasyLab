package Players;

import NPCs.Creature;
import NPCs.EnemyCreature;
import NPCs.SummonedCreature;
import Players.Abilities.Spell;

import java.util.ArrayList;

public interface ICast {
    public void castSpell(Spell spell, EnemyCreature enemy);
    public ArrayList<Spell> getSpells();
    public void addSpell(Spell spell);
    public void summonNewCreature(SummonedCreature creature);
}
