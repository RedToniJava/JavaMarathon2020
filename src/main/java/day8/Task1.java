package day8;

public class Task1 {
    public static void main(String[] args) {
        String string = " ";
        for (int i = 0; i <= 20000; i++) {
            string = string + i + " ";

        }
        System.out.println(string);

        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
    }
}
