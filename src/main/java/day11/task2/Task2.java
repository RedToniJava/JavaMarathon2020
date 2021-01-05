package day11.task2;

public class Task2 {
    public static void main(String[] args) {

        Warrior warrior1 = new Warrior(100, 0.2, 1, 30, 0);
        Paladin paladin1 = new Paladin(100, 0.5, 0.8, 15, 0);
        Magician magician1 = new Magician(100, 1, 0.2, 5, 20);
        Shaman shaman1 = new Shaman(100, 0.8, 0.8, 10, 15);

        warrior1.physicalAttack(paladin1);
        paladin1.physicalAttack(magician1);
        shaman1.healTeammate(magician1);
        magician1.magicalAttack(paladin1);
        shaman1.physicalAttack(warrior1);
        paladin1.healHimself();
        System.out.println();
        for (int i = 0; i < 5; i++) {
            warrior1.physicalAttack(magician1);

        }

    }

}
