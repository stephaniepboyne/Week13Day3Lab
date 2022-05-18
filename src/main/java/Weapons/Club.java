package Weapons;

import Behaviours.IAttack;
import Enemies.Enemy;

public class Club extends Weapon implements IAttack {
    public Club(int damageValue) {
        super(damageValue);
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(this);
    }
}
