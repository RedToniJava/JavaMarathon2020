package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int s;

        Player player1 = new Player(s = rand.nextInt((100 - 90) + 1) + 90);
        Player player2 = new Player(s = rand.nextInt((100 - 90) + 1) + 90);
        Player player3 = new Player(s = rand.nextInt((100 - 90) + 1) + 90);
        Player player4 = new Player(s = rand.nextInt((100 - 90) + 1) + 90);
        Player player5 = new Player(s = rand.nextInt((100 - 90) + 1) + 90);
        Player player6 = new Player(s = rand.nextInt((100 - 90) + 1) + 90);

        for (int i = player1.getStamina(); i > 0; i++) {
            player1.run();
        }
        Player.info();
        Player player7 = new Player(s);
        Player.info();

    }
}

class Player {
    private int stamina;
    private static int countPlayers;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static final int maxPlayers = 6;

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }

    }

    public void run() {
        stamina--;
        if (stamina == MIN_STAMINA) {
            countPlayers--;
            return;
        }
    }

    public static void info() {
        System.out.println(countPlayers + " игроков на поле");
        if (countPlayers == 6) System.out.println("На поле нет свободных мест");
        if (countPlayers < 6)
            System.out.println("Команды неполные. На поле есть ещё " + (maxPlayers - countPlayers) + " свободных мест");

    }

}
