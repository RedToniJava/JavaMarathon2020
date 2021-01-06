package day11.task2;

public class Magician extends Hero implements MagicAttack {

    public Magician() {
        setHealth(100);
        setMagicDef(0.2);
        setPhysDef(1);
        setMagicDamage(20);
        setPhysDamage(5);

    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - getMagicDamage() * hero.getMagicDef());
        System.out.println(hero.toString());

    }

    public String toString() {
        return "Magician health = " + getHealth() + " ";
    }
}
