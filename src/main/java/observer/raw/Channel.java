package observer.raw;

import java.util.ArrayList;
import java.util.List;

import observer.raw.User;

public class Channel {
    private List<User> users = new ArrayList<>();

    public void startEvent(){
        System.out.println("채널1에서 이벤트 시작");
        notifyUser("채널1 : 이벤트 시작");
    }
    public void uploadVideo(){
        System.out.println("채널1에 새 영상 업로드 됨");
        notifyUser("채널1 : 새 영상 업로드");
    }

    public void subscribe(User user) {
        users.add(user);
    }

    public void unsubscribe(User user) {
        users.remove(user);
    }

    public void notifyUser(String msg) {
        users.forEach(user -> user.update(msg));
    }
}
