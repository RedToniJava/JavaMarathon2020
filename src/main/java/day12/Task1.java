package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> automobiles = new ArrayList();
        automobiles.add("BMW ");
        automobiles.add("Jaguar ");
        automobiles.add("Citroen ");
        automobiles.add("Ferrari ");
        automobiles.add("KIA ");

        System.out.println(automobiles.subList(0, 5));

        automobiles.add(3, "Mercedes ");
        automobiles.remove(0);

        System.out.println(automobiles.subList(0, 5));
    }
}
