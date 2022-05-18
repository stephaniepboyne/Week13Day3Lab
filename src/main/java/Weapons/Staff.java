package Weapons;

import Behaviours.IAttack;
import Enemies.Enemy;

public class Staff extends Weapon implements IAttack {
    public Staff(int damageValue) {
        super(damageValue);
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(this);
    }
}
