package day12;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 350; i++) {
            if (i > 30 && i < 300) continue;
            if (i % 2 == 0) list.add(i);
        }

        int lastIndex = list.lastIndexOf(350);
        Collections.shuffle(list);

        Collections.shuffle(list, new Random(list.lastIndexOf(350)));

        System.out.println(list.subList(0, lastIndex));

    }
}
