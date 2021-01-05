package day11.task2;

public class Magician extends Hero implements PhysicalAttack, MagicAttack {
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

    public Magician(int health, double physDef, double magicDef, int physDamage, int magicDamage) {

        this.health = health;
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.physDamage = physDamage;
        this.magicDamage = magicDamage;
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - getMagicDamage() * hero.getMagicDef());
        System.out.println(hero.toString());

    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - getPhysDamage() * hero.getPhysDef());
        System.out.println(hero.toString());

    }

    public String toString() {
        return "Magician health = " + getHealth() + " ";
    }
}
