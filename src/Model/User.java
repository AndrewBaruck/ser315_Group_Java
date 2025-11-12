package Model;

public interface User {

    public String getPassword();
    public String getUsername();
    public boolean logIn();
    public boolean logOut();
    public boolean signUp();
}
