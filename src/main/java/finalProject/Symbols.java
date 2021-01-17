package finalProject;

import java.util.Scanner;

public enum Symbols {
    SHIP("❤️"), WATER("\uD83D\uDFEA"), BAN("\uD83D\uDFE6"), STRIKE("\uD83D\uDFE5"), GOOD_STRIKE("\uD83D\uDDA4");
    private String symbol;

    Symbols(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
//Расстановка кораблей и ореола вокруг них

    public void shipPlay(int l, String[][] board1) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        int x;
        int y;
        String x1;
        System.out.println("Введите начальные координаты корабля.");
        x = scanner.nextInt();
        y = scanner.nextInt();
        if (l == 1) {
           if (board1[x][y]==null)board1[x][y] = SHIP.symbol;

            if (x == 0 && y == 0) {
                board1[x + 1][y] = BAN.symbol;
                board1[x + 1][y + 1] = BAN.symbol;
                board1[x][y + 1] = BAN.symbol;
            } else if (x == 9 && y == 9) {
                board1[x - 1][y - 1] = BAN.symbol;
                board1[x - 1][y] = BAN.symbol;
                board1[x][y - 1] = BAN.symbol;
            } else if (x == 0 && y != 0 && y != 9) {
                board1[x + 1][y - 1] = BAN.symbol;
                board1[x + 1][y] = BAN.symbol;
                board1[x + 1][y + 1] = BAN.symbol;
                board1[x][y - 1] = BAN.symbol;
                board1[x][y + 1] = BAN.symbol;

            } else if (x == 0 && y == 9) {
                board1[x + 1][y - 1] = BAN.symbol;
                board1[x + 1][y] = BAN.symbol;
                board1[x][y - 1] = BAN.symbol;

            } else if (x != 0 && y == 9) {
                board1[x - 1][y - 1] = BAN.symbol;
                board1[x - 1][y] = BAN.symbol;
                board1[x + 1][y - 1] = BAN.symbol;
                board1[x + 1][y] = BAN.symbol;
                board1[x][y - 1] = BAN.symbol;

            } else if (x != 0 && y == 0) {
                board1[x - 1][y] = BAN.symbol;
                board1[x - 1][y + 1] = BAN.symbol;
                board1[x + 1][y] = BAN.symbol;
                board1[x + 1][y + 1] = BAN.symbol;
                board1[x][y + 1] = BAN.symbol;
            } else if (x == 9 && y == 0) {
                board1[x - 1][y] = BAN.symbol;
                board1[x - 1][y + 1] = BAN.symbol;
                board1[x][y + 1] = BAN.symbol;
            }
            else if (x==9&&y!=0&&y!=9){
                board1[x - 1][y - 1] = BAN.symbol;
                board1[x - 1][y] = BAN.symbol;
                board1[x - 1][y + 1] = BAN.symbol;
                board1[x][y - 1] = BAN.symbol;
                board1[x][y + 1] = BAN.symbol;
            }else {
                board1[x - 1][y - 1] = BAN.symbol;
                board1[x - 1][y] = BAN.symbol;
                board1[x - 1][y + 1] = BAN.symbol;
                board1[x + 1][y - 1] = BAN.symbol;
                board1[x + 1][y] = BAN.symbol;
                board1[x + 1][y + 1] = BAN.symbol;
                board1[x][y - 1] = BAN.symbol;
                board1[x][y + 1] = BAN.symbol;
            }
            //не смог придумать как обязать пользователя ставить координаты в линии поэтому от 1-й точки
            //координаты ставятся автоматически слева направо, сверху вниз в зависимости от желания игрока
        } else {
            System.out.println("введите вертикально (в) или горизонтально(г) должен располагаться корабль ");
            //не смог придумать как расставить координаты в 1 строчку как в ТЗ
            x1 = scannerString.nextLine();
            if (x1.equals("г") && x >= 0 && y >= 0 && x <= 9 && y <= 10 - l && board1[x][y] == null) {
                for (int i = 0; i < l; i++) {
                    board1[x][y + i] = SHIP.symbol;
                    if (x != 0 && y + i != 9 && y != 0) {
                        board1[x - 1][y + i - 1] = BAN.symbol;
                        board1[x - 1][y + i] = BAN.symbol;
                        board1[x - 1][y + i + 1] = BAN.symbol;
                        board1[x + 1][y + i - 1] = BAN.symbol;
                        board1[x + 1][y + i] = BAN.symbol;
                        board1[x + 1][y + i + 1] = BAN.symbol;
                        if (i == l - 1) board1[x][y + i + 1] = BAN.symbol;
                        if (i == 0) board1[x][y - 1] = BAN.symbol;
                    } else if (x == 0 && y != 0) {
                        board1[x + 1][y + i - 1] = BAN.symbol;
                        board1[x + 1][y + i] = BAN.symbol;
                        board1[x + 1][y + i + 1] = BAN.symbol;
                        if (i == l - 1) board1[x][y + i + 1] = BAN.symbol;
                        if (i == 0) board1[x][y - 1] = BAN.symbol;
                    } else if (x == 9 && y != 0) {
                        board1[x - 1][y + i - 1] = BAN.symbol;
                        board1[x - 1][y + i] = BAN.symbol;
                        board1[x - 1][y + i + 1] = BAN.symbol;
                        if (i == l - 1) board1[x][y + i + 1] = BAN.symbol;
                        if (i == 0) board1[x][y - 1] = BAN.symbol;
                    } else if (x == 9 && y == 0) {
                        board1[x - 1][y + i] = BAN.symbol;
                        board1[x - 1][y + i + 1] = BAN.symbol;
                        if (i == l - 1) board1[x][y + i + 1] = BAN.symbol;

                    } else if (x == 0 && y == 0) {
                        board1[x + 1][y + i] = BAN.symbol;
                        board1[x + 1][y + i + 1] = BAN.symbol;
                        if (i == l - 1) board1[x][y + i + 1] = BAN.symbol;

                    }

                }
            } else if (x1.equals("в") && x >= 0 && y >= 0 && x <= 10 - l && y <= 9 && board1[x][y] == null) {
                for (int i = 0; i < l; i++) {
                    board1[x + i][y] = SHIP.symbol;
                    if (x != 0 && y + i != 9 && y != 0) {
                        board1[x + i - 1][y - 1] = BAN.symbol;
                        board1[x + i + 1][y - 1] = BAN.symbol;
                        board1[x + i - 1][y + 1] = BAN.symbol;
                        board1[x + i][y - 1] = BAN.symbol;
                        board1[x + i + 1][y + 1] = BAN.symbol;
                        board1[x + i][y + 1] = BAN.symbol;
                        if (i == l - 1) board1[x + i + 1][y] = BAN.symbol;
                        if (i == 0) board1[x - 1][y] = BAN.symbol;
                    } else if (x == 0 && y != 0 && y != 9) {
                        board1[x + i + 1][y - 1] = BAN.symbol;
                        board1[x + i][y - 1] = BAN.symbol;
                        board1[x + i + 1][y + 1] = BAN.symbol;
                        board1[x + i][y + 1] = BAN.symbol;
                        if (i == l - 1) board1[x + i + 1][y] = BAN.symbol;
                    } else if (x != 0 && y == 9) {
                        board1[x + i - 1][y - 1] = BAN.symbol;
                        board1[x + i + 1][y - 1] = BAN.symbol;
                        board1[x + i][y - 1] = BAN.symbol;
                        if (i == l - 1) board1[x + i + 1][y] = BAN.symbol;
                        if (i == 0) board1[x - 1][y] = BAN.symbol;
                    } else if (x == 0 && y == 9) {
                        board1[x + i + 1][y - 1] = BAN.symbol;
                        board1[x + i][y - 1] = BAN.symbol;
                        if (i == l - 1) board1[x + i + 1][y] = BAN.symbol;
                    } else if (x == 0 && y == 0) {
                        board1[x + i + 1][y + 1] = BAN.symbol;
                        board1[x + i][y + 1] = BAN.symbol;
                        if (i == l - 1) board1[x + i + 1][y] = BAN.symbol;

                    }

                }
            } else {
                System.out.println("невозможно разместить корабль");
                shipPlay(l, board1);
            }

        }

    }

}
