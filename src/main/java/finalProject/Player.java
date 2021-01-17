package finalProject;

import java.util.Scanner;

class Players {
    private String[][] board1;
    private String[][] board2;

    public Players(String[][] board1, String[][] board2) {
        this.board1 = board1;
        this.board2 = board2;
    }

    Symbols ship = Symbols.SHIP;
    Symbols strike = Symbols.STRIKE;
    Symbols water = Symbols.WATER;
    Symbols ban = Symbols.BAN;
    Symbols goodStrike = Symbols.GOOD_STRIKE;

//определяем кто ходит первым

    public void play() {

        int rand = (int) (Math.random() * 2);
        System.out.println(rand);
        if (rand == 0) {
            playA(board2);
            System.out.println("Ход первого игрока");
        } else {
            playB(board1);
            System.out.println("Ход второго игрока");
        }

    }

    //не решена задача выхода из цикла атак при победе
//атака первого игрока

    public void playA(String[][] a) {
        System.out.println("Ход первого игрока");

        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        for (; ; ) {
            x = scan.nextInt();
            y = scan.nextInt();
            if (x < 0 || y < 0 || x > 9 || y > 9) {
                System.out.println("невозможные координаты");
                continue;
            } else if (a[x][y].equals(ship.getSymbol())) {
                a[x][y].equals(goodStrike.getSymbol());
                System.out.println("Попал");
                continue;

            } else if ((a[x][y].equals(water.getSymbol())) || a[x][y].equals(ban.getSymbol())) {
                a[x][y].equals(strike.getSymbol());
                System.out.println("Мимо");
                break;
            }

        }
        playB(board1);
    }
//атака 2-го игрока

    public void playB(String[][] b) {
        System.out.println("Ход второго игрока");
        Scanner scan = new Scanner(System.in);
        int x;
        int y;

            for (; ; ) {
                x = scan.nextInt();
                y = scan.nextInt();
                if (x < 0 || y < 0 || x > 9 || y > 9) {
                    System.out.println("невозможные координаты");
                    continue;

                } else if (b[x][y].equals(ship.getSymbol())) {
                    b[x][y].equals(goodStrike.getSymbol());
                    System.out.println("Попал");
                    continue;

                } else if ((b[x][y].equals(water.getSymbol())) || b[x][y].equals(ban.getSymbol())) {
                    b[x][y].equals(strike.getSymbol());
                    System.out.println("Мимо");
                    break;
                }

            }

        playA(board2);
    }
//визуальный вывод результата

    public void result() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board1[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board2[i][j]);
            }
            System.out.println();
        }

    }
}

