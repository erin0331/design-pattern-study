package observer.pattern;

public class App {

    public static void main(String[] args) {
        Channel1 channel1 = new Channel1();
        User user1 = new User1();
        User user2 = new User2();

        channel1.subscribe(user1);
        channel1.subscribe(user2);

        channel1.uploadVideo();

        channel1.unsubscribe(user1);

        channel1.startEvent();
    }
}
