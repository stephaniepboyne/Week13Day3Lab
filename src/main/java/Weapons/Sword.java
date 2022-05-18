package Weapons;

import Behaviours.IAttack;
import Enemies.Enemy;

public class Sword extends Weapon implements IAttack {
    public Sword(int damageValue) {
        super(damageValue);
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(this);
    }
}
