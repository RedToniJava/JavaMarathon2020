package day11.task2;

public abstract class Hero implements PhysicalAttack {
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


    public void setHealth(double health) {
        this.health = health;
    }

    public double getHealth() {
        return health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    public int getPhysDamage() {
        return physDamage;
    }

    public void setPhysDamage(int physDamage) {
        this.physDamage = physDamage;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }

    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - getPhysDamage() * hero.getPhysDef());
        if (hero.getHealth() < getMIN_HEALTH()) hero.setHealth(0);
        System.out.println(hero.toString());
    }
}


