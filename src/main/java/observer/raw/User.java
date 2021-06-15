package observer.raw;
/**
Observer
 **/
public interface User {
    void subscribe(User user);
    void unsubscribe(User user);
    void update(String msg);
}
