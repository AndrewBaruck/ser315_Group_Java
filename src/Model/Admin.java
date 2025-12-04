package Model;
import java.util.Scanner;

public class Admin implements User{

    Scanner sc =  new Scanner(System.in);

    private String username;
    private String password;
    private String fullName;

    public void upgradeCat(Racer r){
        if(r.getCategory() > 1 && r.getCategory() <= 5){
            r.setCategory(r.getCategory()-1);
        } else {
            System.out.println("Category Error. Racer Category: " + r.getCategory());
        }
    }
    public void manageLicense(Racer r){
        License rLicense = r.getLicense();
        if(rLicense == null){
            System.out.println("No license found, create License? (Y/N)");
            String choice = sc.nextLine();
            if(choice.equalsIgnoreCase("Y")){
                rLicense = new License();
                rLicense.createLicence(r.getName(), r.getCreditCard());

            }


        }
        System.out.println("What would you like to do?");
        System.out.println("1. Create license");
        System.out.println("2. Delete license");


    }
    public void manageSystem(){

    }
    public void manageUsers(){

    }

    public String getPassword(){
        return this.password;
    }
    public String getUsername(){
        return this.username;
    }

    @Override
    public boolean logIn() {
        String username = sc.nextLine();
        String password = sc.nextLine();

        if (this.username.equals(username) && this.password.equals(password)){
            return true;
        }
        return false;
    }
    
    public boolean logOut(){
        return false;
    }
    public boolean signUp(){
         this.username = "Admin";
         this.password = "Admin";
         this.fullName = "Admin";
         return true;
    }

}
