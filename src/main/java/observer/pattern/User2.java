package observer.pattern;

public class User2 implements User {
    @Override
    public void update(String msg) {
        System.out.println("User2 알림 받음 : " + msg);
    }
}
