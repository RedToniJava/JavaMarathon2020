package day11.task2;

public abstract class Hero {
    private final int MAX_HEALTH = 100;
    private final int MIN_HEALTH = 0;
    private double health;
    private double physDef;
    private double magicDef;
    private int physDamage;
    private int magicDamage;


    public final int getMAX_HEALTH() {
        return MAX_HEALTH;
    }

    public final int getMIN_HEALTH() {
        return MIN_HEALTH;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public int getPhysDamage() {
        return physDamage;
    }

    public int getMagicDamage() {
        return magicDamage;
    }
}


