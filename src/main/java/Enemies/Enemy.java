package Enemies;

import Behaviours.IAttack;
import Behaviours.IDefend;
import Behaviours.ISpell;
import Defenders.Defender;
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

    public String takeDamage(IAttack weapon){
        if (((Weapon) weapon).getDamageValue() >= this.health){
            this.setHealth(0);
            return "Arghhhhhh *dead*";
        } else this.health -= ((Weapon) weapon).getDamageValue();
        return "Ouch";
    }

    public String takeSpellPower(ISpell spell){
        if (((Spell) spell).getPowerValue() >= this.health){
            this.setHealth(0);
            return "Arghhhhhh *dead*";
        } else this.health -= ((Spell) spell).getPowerValue();
        return "Ouch";

    }

    public String takeDefence(IDefend defender) {
        if (((Defender) defender).getDamageValue() >= this.health){
            this.setHealth(0);
            return "Arghhhhhh *dead*";
        } else this.health -= ((Defender) defender).getDamageValue();
        return "Ouch";
    }
}
