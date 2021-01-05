package day11.task2;

public class Warrior extends Hero implements PhysicalAttack {

    private double health;
    private double physDef;
    private double magicDef;
    private int physDamage;
    private int magicDamage;

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

    public Warrior(int health, double physDef, double magicDef, int physDamage, int magicDamage) {

        this.health = health;
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.physDamage = physDamage;
        this.magicDamage = magicDamage;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - getPhysDamage() * hero.getPhysDef());
        if (hero.getHealth() < getMIN_HEALTH()) hero.setHealth(0);
        System.out.println(hero.toString());
    }

    public String toString() {
        return "Warrior health = " + getHealth() + " ";
    }
}
