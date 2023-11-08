import Equipment.HealingItem;
import NPCs.EnemyCreature;
import NPCs.SummonedCreature;
import Players.*;
import Players.Abilities.Spell;
import Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoomTest {
    Warlock warlock;
    Barbarian barbarian;
    Cleric cleric;
    Room room;
    EnemyCreature troll;

    @Before
    public void before() {
        warlock = new Warlock(20, 5);
        barbarian = new Barbarian(20, 5);
        cleric = new Cleric(20, 5);
        troll = new EnemyCreature("Cave Troll", 20, 6);
        room = new Room(1, troll, null);
        room.addPlayer(warlock);
        room.addPlayer(barbarian);
        room.addPlayer(cleric);
    }

    @Test
    public void hasPlayers() {
        assertEquals(3, room.getPlayers().size());
    }

    @Test
    public void barbarianCanAttack() {
        barbarian.attack(troll);
        assertEquals(10, troll.getHealthPoints());
    }

    @Test
    public void warlockHasSpells() {
        assertEquals(2, warlock.getSpells().size());
    }

    @Test
    public void warlockCanCast() {
        Spell spellToCast = warlock.getSpells().get(1);
        warlock.castSpell(spellToCast, troll);
        assertEquals(-10, troll.getHealthPoints());
    }

    @Test
    public void monsterCanAttackAndClericCanHeal() {
        troll.attack(barbarian);
        troll.attack(barbarian);
        HealingItem potion = cleric.getHealingItems().get(0);
        cleric.useHealingItem(potion, barbarian);
        assertEquals(18, barbarian.getCurrentHealth());
    }

    @Test
    public void shouldNotHealAboveMaxHealth() {
        troll.attack(barbarian);
        HealingItem potion = cleric.getHealingItems().get(0);
        cleric.useHealingItem(potion, barbarian);
        assertEquals(20, barbarian.getCurrentHealth());
    }

    @Test
    public void creatureCanAttack() {
        SummonedCreature creature = warlock.getFamiliar();
        creature.attack(troll);
        assertEquals(17, troll.getHealthPoints());
    }
}
