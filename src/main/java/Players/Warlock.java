package Players;

import Behaviours.IDefend;
import Behaviours.ISpell;

public class Warlock extends Mage{
    public Warlock(String name, int health, IDefend defender, ISpell spell) {
        super(name, health, defender, spell);
    }
}
