package observer.raw;

public class App {
	public static void main(String[] args) {
		Channel channel = new Channel();

		User user1 = new User1(channel);
		User user2 = new User1(channel);

		user1.subscribe(user1);
		user2.subscribe(user2);

		channel.uploadVideo();

		channel.unsubscribe(user1);

		channel.startEvent();

	}
}
