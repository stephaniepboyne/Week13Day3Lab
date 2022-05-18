package Weapons;

import Behaviours.IAttack;
import Enemies.Enemy;

public abstract class Weapon {
    private int damageValue;

    public Weapon(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getDamageValue() {
        return damageValue;
    }

    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }
}
