package day16;

import java.io.*;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        File file1 = new File("C:\\Users\\user\\Desktop\\JavaMarathon\\JavaMarathon2020\\file1.txt");
        File file2 = new File("C:\\Users\\user\\Desktop\\JavaMarathon\\JavaMarathon2020\\file2.txt");

        try {
            if (file1.createNewFile()) System.out.println("Создан новй файл file1.txt");
            if (file2.createNewFile()) System.out.println("Создан новй файл file1.txt");

            int[] numbers1 = new int[1000];
            Random rand = new Random();

            for (int i = 0; i < numbers1.length; i++) {
                numbers1[i] = rand.nextInt(100);

            }
            PrintWriter pw1 = new PrintWriter(file1);
            pw1.println(Arrays.toString(numbers1));
            pw1.close();
            System.out.println(Arrays.toString(numbers1));
            List<Integer>listNumbers1=new ArrayList<>();
            for (int i = 0; i < numbers1.length; i++) {
            listNumbers1.add(numbers1[i]);
            }
            double[] numbers2 = new double[50];

            for(int j=0;j<numbers2.length;j++){
                double meanSum=0;
            for (int i=0;i<19;i++) {
                meanSum+=listNumbers1.get(i);
                listNumbers1.remove(i);
                      }
            numbers2[j]=meanSum/20;

            }
            System.out.println(Arrays.toString(numbers2));

            PrintWriter pw2 = new PrintWriter(file2);
            pw2.println(Arrays.toString(numbers2));
            pw2.close();

        } catch (IOException e) {
            System.out.println("error");
        }
        printResult(file2);

    }
    public static void printResult(File file){

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(", ");
                System.out.println(Arrays.toString(numbersString));
         double[] numbers = new double[50];
           int number=0;
          for (String numb : numbersString) {
                numbers[number++] = Double.parseDouble(numb);
            }
         double sum=0;
          for(int i=0;i<numbers.length;i++){
              sum+=numbers[i];
          }
          int allSum=(int)sum;

            System.out.println(allSum);
        } catch (FileNotFoundException e) {
           System.out.println("File not found");
        }

    }

}
