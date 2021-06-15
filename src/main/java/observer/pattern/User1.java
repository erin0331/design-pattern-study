package observer.pattern;

public class User1 implements User {
    @Override
    public void update(String msg) {
        System.out.println("User1 알림 받음 : " + msg);
    }
}
