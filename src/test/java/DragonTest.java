import Defenders.Dragon;
import Enemies.Orc;
import Enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;
    Orc orc;

    @Before
    public void before(){
        dragon = new Dragon(700);
        orc = new Orc(100);
    }

    @Test
    public void hasDamageValue(){
        assertEquals(700, dragon.getDamageValue());
    }

    @Test
    public void canDefend(){
        dragon.defend(orc);
        assertEquals(0, orc.getHealth());
    }

}
