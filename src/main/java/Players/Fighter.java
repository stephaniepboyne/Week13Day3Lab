package Players;

import Behaviours.IAttack;
import Enemies.Enemy;

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

}
