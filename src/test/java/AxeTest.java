import Enemies.Enemy;
import Enemies.Orc;
import Weapons.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    Axe axe;
    Orc orc;

    @Before
    public void before(){
        axe = new Axe(25);
        orc = new Orc(100);
    }

    @Test
    public void hasDamageValue(){
        assertEquals(25, axe.getDamageValue());
    }

    @Test
    public void canAttack(){
        axe.attack(orc);
        assertEquals(75, orc.getHealth());
    }

}
