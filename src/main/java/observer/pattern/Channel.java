package observer.pattern;

/**
 * Subject
 */
public interface Channel {
    void subscribe(User user); //구독자로 등록
    void unsubscribe(User user); //구독자 해지
    void notifyUser(String msg); //정보 전달
}
