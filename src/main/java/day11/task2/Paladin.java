package day11.task2;

public class Paladin extends Hero implements PhysicalAttack, Healer {

    public Paladin() {
        setHealth(100);
        setMagicDef(0.8);
        setPhysDef(0.5);
        setMagicDamage(0);
        setPhysDamage(15);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 25);
        if (getHealth() > getMAX_HEALTH()) setHealth(getMAX_HEALTH());
        System.out.println(toString());

    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 10);
        if (hero.getHealth() > getMAX_HEALTH()) hero.setHealth(getMAX_HEALTH());
        System.out.println(hero.toString());

    }

    public String toString() {
        return "Paladin health = " + getHealth() + " ";
    }
}
