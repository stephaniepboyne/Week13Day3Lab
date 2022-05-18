package Spells;

public abstract class Spell {
    private int powerValue;

    public Spell(int powerValue) {
        this.powerValue = powerValue;
    }

    public int getPowerValue() {
        return powerValue;
    }

    public void setPowerValue(int powerValue) {
        this.powerValue = powerValue;
    }
}
