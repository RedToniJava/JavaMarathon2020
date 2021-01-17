package finalProject;

public class Ship {}
  /*  private int l;
    public Ship(int l){
        this.l=l;
    }

    public int getL() {
        return l;
    }

     void buildShip(String[][] board1){
         Scanner scannerX = new Scanner(System.in);
         Scanner scannerY = new Scanner(System.in);
         int x = 0;
         int y=0;
         String str = null;

         for (int i = 0; i < 4; i++) {
             if (i == 0) {
                 System.out.println("Разместите 4-х палубный корабль. Введите координаты начальной точки корабля");
                 x = scannerX.nextInt();
                 y = scannerX.nextInt();
                 System.out.println("Введите расположение корабля: вертикально или горизонтально");
                 str = scannerY.nextLine();
                 board1[x][y] = "\uD83D\uDEE5";
             } else if (str.equals("горизонтально") && y < 7 && x > -1 && y > -1 && i > 0)
                 board1[x][y + i] = "\uD83D\uDEE5";
             else if (str.equals("вертикально") && x < 7 && x > -1 && y > -1 && i > 0)
                 board1[x + i][y] = "\uD83D\uDEE5";
             else {
                 System.out.println("Введены неверные данные");
                 buildShip(board1);

             }
             if (str.equals("горизонтально")) {
                 board1[x + 1][y + i] = "\uD83D\uDFE6";
                 board1[x - 1][y + i] = "\uD83D\uDFE6";
                 board1[x + 1][y - 1] = "\uD83D\uDFE6";
                 board1[x][y - 1] = "\uD83D\uDFE6";
                 board1[x - 1][y - 1] = "\uD83D\uDFE6";
                 board1[x + 1][y + 3] = "\uD83D\uDFE6";
                 board1[x][y + 4] = "\uD83D\uDFE6";
                 board1[x - 1][y + 3] = "\uD83D\uDFE6";

             } else if (str.equals("вертикально") && x == 0) {
                 board1[x + i][y + 1] = "\uD83D\uDFE6";
                 board1[x + i][y - 1] = "\uD83D\uDFE6";
                 board1[x + 4][y + 1] = "\uD83D\uDFE6";
                 board1[x + 4][y] = "\uD83D\uDFE6";
                 board1[x + 4][y - 1] = "\uD83D\uDFE6";

             }
             else if (str.equals("вертикально")&&y==0) {
                 board1[x + i][y + 1] = "\uD83D\uDFE6";
                 board1[x - 1][y] = "\uD83D\uDFE6";
                 board1[x - 1][y + 1] = "\uD83D\uDFE6";
                 board1[x + 4][y + 1] = "\uD83D\uDFE6";
                 board1[x + 4][y] = "\uD83D\uDFE6";
             }
             else if (str.equals("вертикально") && x == 0&&y==0) {
                 board1[x + i][y + 1] = "\uD83D\uDFE6";
                 board1[x + 4][y + 1] = "\uD83D\uDFE6";
                 board1[x + 4][y] = "\uD83D\uDFE6";}

             else if (str.equals("вертикально")&&x!=0&&y!=0) {
                 board1[x + i][y + 1] = "\uD83D\uDFE6";
                 board1[x + i][y - 1] = "\uD83D\uDFE6";
                 board1[x - 1][y - 1] = "\uD83D\uDFE6";
                 board1[x - 1][y] = "\uD83D\uDFE6";
                 board1[x - 1][y + 1] = "\uD83D\uDFE6";
                 board1[x + 4][y + 1] = "\uD83D\uDFE6";
                 board1[x + 4][y] = "\uD83D\uDFE6";
                 board1[x + 4][y - 1] = "\uD83D\uDFE6";
             }
         }
         for (int i = 0; i < 10; i++) {
             System.out.print(i);
             for (int j = 0; j < 10; j++) {
                 if (board1[i][j] == null)
                     board1[i][j] = "⬜";

                 System.out.print(board1[i][j]);
             }
             System.out.println();
         }
    }
}
*/