
package model;

public class Administrator implements User {
    private String username;
    private String password;

    public void upgradeCat() { /* TODO */ }
    public void manageLicense() { /* TODO */ }
    public void manageSystem() { /* TODO */ }
    public void manageUsers() { /* TODO */ }

    @Override public String getPassword() { return password; }
    @Override public String getUserName() { return username; }
    @Override public boolean login() { return false; }
    @Override public boolean logout() { return false; }
    @Override public void signup() { /* TODO */ }
}
