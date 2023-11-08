package NPCs;

public abstract class Creature {
    private String name;
    private int healthPoints;
    private int damage;

    public Creature(String name, int healthPoints, int damage) {
        this.name = name; //TODO: current health/full health
        this.healthPoints = healthPoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void takeDamage(int damage) {
        this.healthPoints -= damage;
    }

//    public abstract void attack();
}
