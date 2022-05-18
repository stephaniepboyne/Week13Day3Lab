package Spells;

import Behaviours.ISpell;
import Enemies.Enemy;

public class SwarmOfAngryCats extends Spell implements ISpell {
    public SwarmOfAngryCats(int powerValue) {
        super(powerValue);
    }
    public void cast(Enemy enemy){
        enemy.takeSpellPower(this);
    }

}
