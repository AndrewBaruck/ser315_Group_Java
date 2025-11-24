package View;

import Model.Race;
import Model.Racer;
import Model.User;
import java.util.InputMismatchException;
import java.util.List;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class RacerUI implements RoleUI {

    //Global user input
    Scanner input = new Scanner(System.in);


    ///// Login methods //////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Displays welcome race portal banner. Also prompts user if they want to login to their account or sign up for an account.
     *
     * @returns the user's choice as a integer
     *      1 - Login to an account
     *      2 - Signup for an account
     */
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
        return readUserChoice();
    }

    /**
     * Prompts user to enter their username and password.
     *
     * @return a string array with 2 elements
     *      Index 0 - Username input
     *      Index 1 - Password input
     *
     */
    public String[] displayLogin(){

        String[] credentials= new String[2];

        System.out.println("Please enter username: ");
        String username = input.nextLine();

        System.out.println("Please enter password: ");
        String password = input.nextLine();

        credentials[0] = username;
        credentials[1] = password;

        return credentials;
    }

    /**
     * Displays error message indicating that the username was not found.
     */
    public void displayUsernameNotFound(){
        System.out.println("Username not found");
    }

    /**
     * Displays error message indicating that the username or password combination is not correct.
     */
    public void displayInvalidLoginCombination(){
        System.out.println("Error: Username or password combination is incorrect.");
    }

    /**
     * Displays a success message that the login was successful
     */
    public void displaySuccessLogin(){
        System.out.println("You Successfully logged in");
    }

    //////// End of login //////////////////////////////////////////////////////////////////////////////////////////////



    ///// Registration methods//////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Displays license registration banner and prompts user to enter name and payment information
     *
     * @return a string array with 2 elements:
     *        Index 0 - user's name
     *        Index 1 - Payment information
     */
    public String[] displayLicenceRegistration(){

        String[] licenceRegistration = new String[2];

        System.out.println("===============================" +
                "Licence Registration Page\n" +
                "===============================\n" +
                "Enter Name: \n" +
                "Enter Payment: \n"
        );
        licenceRegistration[0] = input.nextLine();
        licenceRegistration[1] = input.nextLine();
        return licenceRegistration;
    }

    /**
     * Displays an error message about payment information being invalid. Also, prompts the user to try entering their
     * licence registration information in again
     * or quit the application
     *
     *   @return the user's choice as an integer:
     *          1 — try re-entering licence registration again
     *          2 — quit application
     */
    public int displayInvalidRegistration(){
        System.out.println("Error: The payment information provided is invalid.");
        System.out.println("Would you like to try again or quit?" +
                "   1.) Try again" +
                "   2.) Quit"
        );
        return readUserChoice();
    }

    /**
     * Displays a confirmation message indicating that the user has successfully registered for their license.
     * Also displays message for race registration processing.
     */

    public void displaySucessfulRegistration(){
        System.out.println("You successfully registered for a license!");
        System.out.println("Processing race registration...");
    }

    /**
     * Strategy method for a logged-in Racer.
     * This is what SystemController will call for Racer users.
     */
    @Override
    public void showRoleMenu(User user) {
        Racer racer = (Racer) user;

        boolean running = true;
        while (running) {
            int choice = displayUserDashboard();

            switch (choice) {
                case 1:
                    // Register for a race
                    System.out.println("TODO: hook up race registration here.");
                    break;
                case 2:
                    // Manage current registered race
                    System.out.println("TODO: hook up manage registered race here.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            running = false;
        }
    }

    ////////// End of registration ///////////////////////////////////////////////////////////////////////////////////




    //////// Race selection  ///////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Displays the user dashboard menu.
     * Prompts the user to choose between registering for a race or managing an registered race that they are in.
     *
     * @return the user's choice as an integer:
     *         1 - register for a race
     *         2 - manage current registered race
     */
    public int displayUserDashboard(){

        System.out.println(
                "What would you like to do?:\n" +
                        "1.) Register for race\n" +
                        "2.) Manage Current registered race\n"
        );
        return readUserChoice();
    }

    /**
     * Displays error message indicating that the race selected is invalid due to user not having a license which is needed
     * for an official race.
     * Prompts user to register for a license or go back to race page.
     *
     * @returns the user choice as an integer
     *      1 - Go to license registration page
     *      2 - Go back to displaying races
     */
    public int displayInvalidLicense(){
        System.out.println(
                "Error: You don’t have a valid driver license to register for an official race. \n" +
                        "Choose a option from the following list\n" +
                        "   1.) Register for licence \n" +
                        "   2.) Go back\n"
        );
        return readUserChoice();
    }

    /**
     * Displays a formatted list of available races with details such as distance, type, registration deadline,
     * category level, route, official status, open seats, and race date.
     * Prompts the user to select a race by its displayed ID and returns their selection.
     *
     * @param races the list of Race objects to be displayed
     * @return the user's selected race ID as an integer
     */
    public int displayRacesAndGetSelection(List<Race> races) {
        if (races == null || races.isEmpty()) {
            System.out.println("No races available at the moment.");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        int id = 0;

        System.out.println("========================================================================================================================================================");
        System.out.println("                                                                Races:                                                                                  ");
        System.out.println("========================================================================================================================================================");
        System.out.println("  Race ID   |   Distance    |   Race Type   |    Sign-Up Deadline   |Category Level |       Route       |   Official    |   Open Seats  |   Race Date   ");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Race race : races) {
            System.out.printf("\t %d \t\t|\t\t %.1f \t|\t %-8s  \t|\t %-10s \t\t|\t\t %-2s\t\t| %-15s \t|\t  %-4s  \t|\t\t %-4s\t|\t %-16s%n",
                    // race.getRaceId(),// ADD
                    ++id,
                    race.getDistance(),
                    race.getType(),
                    race.getRegDeadline(),
                    race.getReqCat(),
                    race.getRoute(),
                    race.isOfficial(),
                    race.getParticipationLimit(),
                    race.getRaceDate()
            );
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        System.out.println("\nSelect the race ID that you want to sign up for:");

        while (true) {
            try {
                //Get user input
                return input.nextInt();
            }
            //Catch if user input is a non integer value
            catch (InputMismatchException e ) {
                System.out.println("Error: Invalid input. Please enter a number.");
                input.nextLine(); //Clear buffer
            }
        }
    }

    /**
     * Displays an error message indicating that the selected race's category level is too high
     * for the user. Prompts the user to select a race with a lower category level.
     */
    public void displayInvalidCatLevel(){
        System.out.println("Error: Race ID 1 category level is too high. Please select a lower level Category!");
    }

    /**
     * Displays an error message indicating that the race's participation limit has been reached.
     * Informs the user that they cannot register at this time and suggests trying again later.
     */
    public void displayErrorMaxSeats(){
        System.out.println("Error: participation limit is reached.  Please try signing up again at a later time.");
    }

    /**
     * Displays a confirmation message indicating that the user has successfully registered for a race.
     */
    public void displaySuccessfulRaceRegistration(){
        System.out.println("Successfully registered for a race!");
    }
    //////// End of Race selection  ////////////////////////////////////////////////////////////////////////////////////



    //////// Helper methods ////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Continuously prompts the user to enter a valid menu choice until a valid input is received.
     * Accepts only integer values 1 or 2. If the input is invalid or not an integer, an error message is displayed,
     * and the user is prompted again.
     *
     * @return the validated user choice as an integer (1 or 2)
     */
    private int readUserChoice() {
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
            //Catch if user input is a non integer value
            catch (InputMismatchException e ) {
                System.out.println("Error: Invalid input. Please enter 1 or 2.");
                input.nextLine(); //Clear buffer
            }
        }
    }
    //////// End of helper methods ////////////////////////////////////////////////////////////////////////////////////////////
}