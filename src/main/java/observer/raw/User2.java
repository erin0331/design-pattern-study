package observer.raw;

public class User2 implements User {
    private Channel channel;

    public User2(Channel channel) {
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
        System.out.println("User2 알림 받음 : " + msg);
    }
}
