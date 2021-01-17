package finalProject;

public class Task1 {
    public static void main(String[] args) {
        String[][] player1 = new String[10][10];
        String[][] player2 = new String[10][10];
        Players payers= new Players(player1,player2);


        System.out.println("Ход первого игрока. Расставьте свои корабли.");
        placement(player1);
        System.out.println("Ход второго игрока. Расставьте свои корабли.");
        placement(player2);
        payers.play();
        payers.result();


    }

    public static void placement(String[][] board1) {
        Symbols water = Symbols.WATER;
        Symbols ship = Symbols.SHIP;
        System.out.println("Разместите 1 четырехпалубник");
        ship.shipPlay(4, board1);
        System.out.println("Разместите 2 трехпалубника");
        ship.shipPlay(3, board1);
        ship.shipPlay(3, board1);
        System.out.println("Разместите 3 двуххпалубника");
        ship.shipPlay(2, board1);
        ship.shipPlay(2, board1);
        ship.shipPlay(2, board1);
        System.out.println("Разместите 4 однопалубника");
        ship.shipPlay(1, board1);
        ship.shipPlay(1, board1);
        ship.shipPlay(1, board1);
        ship.shipPlay(1, board1);

        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            for (int j = 0; j < 10; j++) {
                if (board1[i][j] == null)
                    board1[i][j] = water.getSymbol();

                System.out.print(board1[i][j]);
            }
            System.out.println();
        }

    }


}
