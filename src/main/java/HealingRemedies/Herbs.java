package HealingRemedies;

import Behaviours.IHeal;
import Players.Fighter;

public class Herbs extends Remedy implements IHeal {

    public Herbs(int healingPower) {
        super(healingPower);
    }
}
