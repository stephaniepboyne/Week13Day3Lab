package Players;

import Behaviours.IDefend;
import Behaviours.ISpell;
import Enemies.Enemy;

public abstract class Mage extends Player implements IDefend, ISpell {

    private IDefend defender;
    private ISpell spell;

    public Mage(String name, int health, IDefend defender, ISpell spell) {
        super(name, health);
        this.defender = defender;
        this.spell = spell;
    }

    public IDefend getDefender() {
        return defender;
    }

    public void setDefender(IDefend defender) {
        this.defender = defender;
    }

    public ISpell getSpell() {
        return spell;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public void defend(Enemy enemy){
        this.defender.defend(enemy);
    }

    public void cast(Enemy enemy){
        this.spell.cast(enemy);
    }
}
