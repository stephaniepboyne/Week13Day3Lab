import Enemies.Troll;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;
    Sword sword;

    @Before
    public void before(){
        troll = new Troll(50);
        sword = new Sword(50);
    }

    @Test
    public void asHealth(){
        assertEquals(50, troll.getHealth());
    }

    @Test
    public void canTakeDamage(){
        troll.takeDamage(sword);
        assertEquals(0, troll.getHealth());
    }
}
