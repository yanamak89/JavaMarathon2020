package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2, "Hello from User1");
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "Hej, user1");
        user2.sendMessage(user1, "I'm user2, nice to meet you.");
        user2.sendMessage(user1, "I'm fine, and how are you?");

        user3.sendMessage(user1, "Hi, my name is user3");
        user3.sendMessage(user1, "How are you?");
        user3.sendMessage(user1, "We need to talk...");

        user1.sendMessage(user3, "Hi, I'm fine");
        user1.sendMessage(user3, "Are you available tomorrow?");

        user3.sendMessage(user1, "Yes, we can meet tomorrow.");

        MessageDatabase.showDialog(user1, user2);
    }
}
