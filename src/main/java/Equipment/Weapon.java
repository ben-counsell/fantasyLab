package Equipment;

public class Weapon extends Equipment {
    private String name;
    private int damageModifier;

    public Weapon(String name, int damageModifier) {
        super(name);
        this.damageModifier = damageModifier;
    }

    public int getDamageModifier() {
        return damageModifier;
    }
}
