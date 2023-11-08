package Equipment;

public class HealingItem extends Equipment {

    private String name;
    private int healingAmount;

    public HealingItem (String name, int healingAmount){
        super(name);
        this.healingAmount = healingAmount;
    }

    public int getHealingAmount(){
        return healingAmount;
    }
}