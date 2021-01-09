package day13;

import java.util.ArrayList;
import java.util.List;

import static day13.MessageDatabase.addNewMessage;

public class User {
    private String name;
    private List<User> subscription;

    public User(String name, List<User> subscription) {
        this.name = name;
        this.subscription = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public List<User> getSubscription() {
        return subscription;
    }


    public void subscribe(User user) {
        getSubscription().add(user);
    }

    public boolean isSubscribed(User user) {
        if (getSubscription().indexOf(user) >= 0)
            return true;
        else return false;
    }

    public boolean isFriend(User user1) {
        boolean isFriend = false;
        for (User user : user1.getSubscription()) {
            if (user1.isSubscribed(user) && user.isSubscribed(user1)) {
                isFriend = true;
            } else isFriend = false;
        }
        return isFriend;

    }

    public void sendMessage(User user, String text) {
        Message newMessage = new Message(this, user, text);
        addNewMessage(this, user, text);

    }

    public String toString() {
        return getName() + " ";
    }

}
