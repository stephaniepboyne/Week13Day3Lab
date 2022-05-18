package Spells;

import Behaviours.ISpell;
import Enemies.Enemy;

public class Lightening extends Spell implements ISpell {
    public Lightening(int powerValue) {
        super(powerValue);
    }

    public void cast(Enemy enemy){
        enemy.takeSpellPower(this);
    }
}
