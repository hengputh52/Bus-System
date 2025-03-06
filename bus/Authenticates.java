package bus;

public interface Authenticates {
    void register(String username, String password);
    boolean login(String username, String password);
    void logout();
}
