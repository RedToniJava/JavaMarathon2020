package day11.task2;

public class Shaman extends Hero implements PhysicalAttack, Healer, MagicAttack {

    public Shaman() {
        setHealth(100);
        setMagicDef(0.8);
        setPhysDef(0.8);
        setMagicDamage(15);
        setPhysDamage(10);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 50);
        if (getHealth() > getMAX_HEALTH()) setHealth(getMAX_HEALTH());
        System.out.println(toString());
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 30);
        if (hero.getHealth() > getMAX_HEALTH()) hero.setHealth(getMAX_HEALTH());
        System.out.println(hero.toString());

    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - getMagicDamage() * hero.getMagicDef());
        System.out.println(hero.toString());

    }

    public String toString() {
        return "Shaman health = " + getHealth() + " ";
    }
}
