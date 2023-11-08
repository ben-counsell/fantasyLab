package Players.Abilities;

public class Spell {
    private final String name;
    private final int damage;

    public Spell(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
