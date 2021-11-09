package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");

        user1.sendMessage(user2,"Hello from user 1");
        user2.sendMessage(user1,"Hello from user 2");

        MessageDataBase.showDialog(user1,user2);
    }
}
