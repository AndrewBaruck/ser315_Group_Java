package Model;

import java.time.LocalDate;

public class Organizer implements User{

    private String username;
    private String password;
    private String fullName;

    public Organizer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void createRace(double dist, int limit, String type, LocalDate raceDay,
                      LocalDate deadline, boolean official, int cat, String route){
        

    }
    public void updateRace(){
        System.out.println("What would you like to update?");
        System.out.println("1. Distance \n2. Limit \n 3. Type \n4. Race Day \n5. Sign up Deadline \n6. Official Status \n7. Required Category \n8. Route");
        String choice = sc.nextLine();

        case "1":
            System.out.print("Enter the new Distance: ");
            double newDist = sc.nextDouble();
        case "2":
            System.out.print("Enter the new Limit: ");
            int newLimit = sc.nextInt();
        case "3":
            System.out.print("Enter the new Type: ");
            String newType = sc.nextLine();
        case "4":
            System.out.print("Enter the new Race Day: ");
            String newDate = sc.nextLine();
        case "5":
            System.out.print("Enter the new Sign up Deadline: ");
            String newDeadline = sc.nextLine();
        case "6":
            System.out.print("Enter new status: ");
            String newStatus = sc.nextLine();
        case "7":
            System.out.print("Enter new Category: ");
            int newCat = sc.nextInt();
        case "8":
            System.out.print("Enter new Route: ");
            String newRoute = sc.nextLine();
        default:
            System.out.println("Invalid choice.");
        
    }
    public void enterResults(Race race, Racer first, Racer second,  Racer third){
        Review review = new Review( race,  first,  second,   third);
    }

    public boolean logIn(){
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
        System.out.println("Please enter your username: ");
        this.username = sc.nextLine();
        System.out.println("Please enter your password: ");
        this.password = sc.nextLine();
        System.out.println("Please enter your full name: ");
        this.fullName = sc.nextLine();

        return true;
    }
    public String getPassword(){
        return this.password;
    }
    public String getUsername(){
        return this.username;
    }
}

