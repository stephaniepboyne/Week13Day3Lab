package Players;

import Behaviours.IAttack;
import Behaviours.IHeal;
import Enemies.Enemy;
import HealingRemedies.Remedy;

public abstract class Fighter extends Player{

    private IAttack weapon;

    public Fighter(String name, int health, IAttack weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    public IAttack getWeapon() {
        return weapon;
    }

    public void setWeapon(IAttack weapon) {
        this.weapon = weapon;
    }

    public void attack(Enemy enemy){
        this.getWeapon().attack(enemy);
    }

    public void getHealed(IHeal remedy){
        int health = this.getHealth();
        this.setHealth(health += ((Remedy) remedy).getHealingPower());
    }


}
