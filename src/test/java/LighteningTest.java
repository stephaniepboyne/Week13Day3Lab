import Behaviours.ISpell;
import Enemies.Enemy;
import Enemies.Troll;
import Spells.Lightening;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LighteningTest {

    Lightening lightening;
    Troll troll;

    @Before
    public void before(){
        lightening = new Lightening(100);
        troll = new Troll(100);
    }

    @Test
    public void hasPowerValue(){
        assertEquals(100, lightening.getPowerValue());
    }

    @Test
    public void canCast(){
        lightening.cast(troll);
        assertEquals(0, troll.getHealth());
    }

}
