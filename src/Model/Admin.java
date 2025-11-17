package Model;

public class Admin implements User{

    private String username;
    private String password;
    private String fullName;

    public void upgradeCat(){

    }
    public void manageLicense(){

    }
    public void manageSystem(){

    }
    public void manageUsers(){

    }

    public String getPassword(){
        return "admin";
    }
    public String getUsername(){
        return "admin";
    }
    public boolean logIn(){
        return false;
    }
    public boolean logOut(){
        return false;
    }
    public boolean signUp(){
        return false;
    }



}
