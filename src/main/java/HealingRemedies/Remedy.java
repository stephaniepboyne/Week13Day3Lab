package HealingRemedies;

import Behaviours.IHeal;
import Players.Fighter;


public abstract class Remedy implements IHeal {

    private int healingPower;

    public Remedy(int healingPower) {
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }

    public void heal(Fighter fighter){
        fighter.getHealed(this);
    }
}
