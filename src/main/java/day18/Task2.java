package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237));

    }

    public static int count7(int i) {
        String int7 = String.valueOf(i);
        String[] arrayString = int7.split("");
        int sum = 0;
        if (i == 0) return sum;

        if (Integer.parseInt(arrayString[String.valueOf(i).split("").length - 1]) != 7) {
            return count7(i / 10);
        } else return sum + 1 + count7(i / 10);


    }

}
