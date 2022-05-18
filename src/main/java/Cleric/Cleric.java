package Cleric;

import Behaviours.IHeal;
import Players.Fighter;

public class Cleric {

    private IHeal remedy;

    public Cleric(IHeal remedy) {
        this.remedy = remedy;
    }

    public IHeal getRemedy() {
        return remedy;
    }

    public void setRemedy(IHeal remedy) {
        this.remedy = remedy;
    }

    public void heal(Fighter fighter){
        this.getRemedy().heal(fighter);
    }
}
