package day13;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<User> subscriptions1 = new ArrayList<>();
        List<User> subscriptions2 = new ArrayList<>();
        List<User> subscriptions3 = new ArrayList<>();

        User user1 = new User("Toni", subscriptions1);
        User user2 = new User("Bob", subscriptions2);
        User user3 = new User("Frank", subscriptions3);

        user1.subscribe(user2);
        user2.subscribe(user1);

        System.out.println(user1.getSubscription().lastIndexOf(user2));
        System.out.println(user1.isSubscribed(user2));
        System.out.println(user1.isFriend(user2));
        user1.sendMessage(user2, "Hello");
        user1.sendMessage(user2, "How are you?");
        user2.sendMessage(user1,"Hi");
        user2.sendMessage(user1,"I`m fine");
        user2.sendMessage(user1,"And you?");
        user3.sendMessage(user1,"Good morning");
        user3.sendMessage(user1,"May I am not go to school  tomorrow?");
        user3.sendMessage(user1,"Please");
        user1.sendMessage(user2, "Hi");
        user1.sendMessage(user2, "No you not");
        user1.sendMessage(user2, "You must learning");
        user3.sendMessage(user1, ":((");

        user3.vieu(user1);

    }

}
