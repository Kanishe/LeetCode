package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
//        User user1 = new User("");
//        for (int i = 0; i < subscriptions.size(); i++) {
//            User user2 = subscriptions.get(i);
//
//               if(user2.getUsername().equals(user2.getUsername()))
//                return true;
//
//
//        }

        for (User currentUser : subscriptions) {
            if (currentUser.getUsername().equals(user.getUsername()))
                return true;
        }
        return false;
    }

    public boolean isFriend(User user) {
        return this.isSubscribed(user)
                &&
                user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
MessageDataBase.addNewMessage(this,user,text);
    }

    @Override
    public String toString() {
        return username;
    }
}
