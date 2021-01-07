package day13;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<User>subscriptions1=new ArrayList<>();
        List<User>subscriptions2=new ArrayList<>();

        User user1=new User("Toni",subscriptions1);
        User user2=new User("Toni",subscriptions2);

        user1.subscribe(user2);
        user2.subscribe(user1);

        System.out.println(user1.getSubscription().lastIndexOf(user2));
        System.out.println(user1.isSubscribed(user2));
        System.out.println(user1.isFriend(user2));


    }
}
