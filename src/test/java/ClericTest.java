import Behaviours.IAttack;
import Behaviours.IHeal;
import Cleric.Cleric;
import HealingRemedies.Potion;
import Players.Barbarian;
import Players.Knight;
import Weapons.Sword;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    IHeal remedy;
    Knight knight;
    IAttack weapon;

    @Before
    public void before(){
        remedy = new Potion(50);
        weapon = new Sword(70);
        cleric = new Cleric(remedy);
        knight = new Knight("Patric", 15, weapon);
    }

    @Test
    public void canHeal(){
        cleric.heal(knight);
        assertEquals(65, knight.getHealth());
    }
}
