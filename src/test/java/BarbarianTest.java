import Behaviours.IAttack;
import Enemies.Orc;
import HealingRemedies.Herbs;
import Players.Barbarian;
import Weapons.Axe;
import Weapons.Sword;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    IAttack weapon;
    IAttack weapon2;
    Orc orc;
    Herbs herbs;

    @Before
    public void before(){
        weapon = new Sword(50);
        weapon2 = new Axe(25);
        barbarian = new Barbarian("Conan", 100, weapon);
        orc = new Orc(80);
        herbs = new Herbs(20);
    }

    @Test
    public void hasName(){
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(100, barbarian.getHealth());
    }

    @Test
    public void hasWeapon(){
        assertEquals(weapon, barbarian.getWeapon());
    }

    @Test
    public void canChangeWeapon(){
        barbarian.setWeapon(weapon2);
        assertEquals(weapon2, barbarian.getWeapon());
    }

    @Test
    public void canAttack(){
        barbarian.setWeapon(weapon2);
        barbarian.attack(orc);
        assertEquals(55, orc.getHealth());
    }

    @Test
    public void canGetHealed(){
        barbarian.getHealed(herbs);
        assertEquals(120, barbarian.getHealth());
    }

}
