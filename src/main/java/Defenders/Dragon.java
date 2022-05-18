package Defenders;

import Behaviours.IDefend;
import Enemies.Enemy;

public class Dragon extends Defender implements IDefend {
    public Dragon(int damageValue) {
        super(damageValue);
    }

    public void defend(Enemy enemy){
        enemy.takeDefence(this);
    }
}
