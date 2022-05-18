package Spells;

import Behaviours.ISpell;
import Enemies.Enemy;

public class Fireball extends Spell implements ISpell {
    public Fireball(int powerValue) {
        super(powerValue);
    }

    public void cast(Enemy enemy){
        enemy.takeSpellPower(this);
    }

}
