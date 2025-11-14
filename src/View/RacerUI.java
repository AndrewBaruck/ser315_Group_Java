package View;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RacerUI implements UserUI {
    //Global user input
    Scanner input = new Scanner(System.in);

    public void displayOptions(){
    }
    public void buyLicense(){
    }
    public void raceSignUp(){
    }




    public int displayWelcomePage() {
       //Login header
        System.out.println(
                "=============================\n"
                +"Welcome to the Racer Portal\n"
                +"============================\n"
        );
        //Login options
        System.out.println(
                "Choose a option below:\n" +
                        "1.) Login\n" +
                        "2.) Sign Up\n"
        );
        while (true) {
            try {
                //Get user input
                int choice = input.nextInt();

                //Check if input is valid choice (1 or 2)
                if (choice == 1 || choice == 2) {
                    return choice;
                } else {
                    System.out.println("Error: Invalid input. Please enter 1 or 2.");
                }
            }
            //Catch if user input is a non interger value
            catch (InputMismatchException e ) {
                System.out.println("Error: Invalid input. Please enter 1 or 2.");
                input.nextLine(); //Clear buffer
            }
        }
    }

    @Override
    public String getMessage() {
        return "";
    }

    @Override
    public void setMessage(String message) {

    }

    @Override
    public void displayMessage() {

    }
}
