package observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel1 implements Channel {
    private List<User> users = new ArrayList<>();

    public void startEvent(){
        System.out.println("채널1에서 이벤트 시작");
        notifyUser("채널1 : 이벤트 시작");
    }
    public void uploadVideo(){
        System.out.println("채널1에 새 영상 업로드 됨");
        notifyUser("채널1 : 새 영상 업로드");
    }

    @Override
    public void subscribe(User user) {
        users.add(user);
    }

    @Override
    public void unsubscribe(User user) {
        users.remove(user);
    }

    @Override
    public void notifyUser(String msg) {
        users.forEach(user -> user.update(msg));
    }
}
