package Defenders;

import Behaviours.IDefend;
import Enemies.Enemy;

public class Ogre extends Defender implements IDefend {
    public Ogre(int damageValue) {
        super(damageValue);
    }

    public void defend(Enemy enemy){
        enemy.takeDefence(this);
    }
}
