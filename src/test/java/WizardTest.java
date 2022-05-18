import Behaviours.IDefend;
import Behaviours.ISpell;
import Defenders.Dragon;
import Defenders.Ogre;
import Enemies.Orc;
import Players.Wizard;
import Spells.Spell;
import Spells.SwarmOfAngryCats;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    IDefend defender;
    ISpell spell;
    Orc orc;
    Ogre ogre;

    @Before
    public void before(){
        defender = new Dragon(700);
        ogre = new Ogre(200);
        spell = new SwarmOfAngryCats(10);
        orc = new Orc(50);
        wizard = new Wizard("Gandalf", 200, defender, spell);
    }

    @Test
    public void canDefend(){
        wizard.defend(orc);
        assertEquals(0, orc.getHealth());
    }

    @Test
    public void canCast(){
        wizard.cast(orc);
        assertEquals(40, orc.getHealth());
    }

    @Test
    public void canChangeDefender(){
        wizard.setDefender(ogre);
        assertEquals(ogre, wizard.getDefender());
    }
    
}
