package Weapons;

import Behaviours.IAttack;
import Enemies.Enemy;

public class Axe extends Weapon implements IAttack {
    public Axe(int damageValue) {
        super(damageValue);
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(this);
    }
}
