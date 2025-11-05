
package model;

public interface User {
    String getPassword();
    String getUserName();
    boolean login();
    boolean logout();
    void signup();
}
