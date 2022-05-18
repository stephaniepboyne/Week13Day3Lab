package Players;

import Behaviours.IDefend;
import Behaviours.ISpell;
import Defenders.Defender;

public class Wizard extends Mage{
    public Wizard(String name, int health, IDefend defender, ISpell spell) {
        super(name, health, defender, spell);
    }
}
