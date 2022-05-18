package Enemies;

import Behaviours.IAttack;
import Behaviours.ISpell;
import Spells.Spell;
import Weapons.Weapon;

public abstract class Enemy {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(IAttack weapon){
        this.health -= ((Weapon) weapon).getDamageValue();
    }

    public void takeSpellPower(ISpell spell){
        this.health -= ((Spell) spell).getPowerValue();
    }
}
