package day11.task2;

public class Warrior extends Hero {

    public Warrior() {
        setHealth(100);
        setMagicDef(1);
        setPhysDef(0.2);
        setMagicDamage(0);
        setPhysDamage(30);

    }

    public String toString() {
        return "Warrior health = " + getHealth() + " ";
    }
}
