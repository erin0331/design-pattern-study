package observer.raw;

public class User1 implements User {
    private Channel channel;

    public User1(Channel channel) {
        this.channel = channel;
    }

    @Override
    public void subscribe(User user) {
        channel.subscribe(this);
    }

    @Override
    public void unsubscribe(User user) {
        channel.unsubscribe(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("User1 알림 받음 : " + msg);
    }
}
