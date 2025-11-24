import Controller.SystemController;
import Model.Racer;
import Model.User;
import View.RacerUI;

public class Main {
    public static void main(String[] args) {
        SystemController systemController = new SystemController();

        RacerUI racerUI = new RacerUI();

        int welcomeChoice = racerUI.displayWelcomePage();
        if (welcomeChoice == 1) {
            String[] credentials = racerUI.displayLogin();
            User loggedInUser = new Racer(); // temporary dummy user

            racerUI.displaySuccessLogin();

            // Now hand control to the SystemController,
            // which will choose and run the correct UI Strategy
            systemController.startSession(loggedInUser);
        } else {
            System.out.println("Signup flow not yet implemented.");
        }

        systemController.shutDown();
    }
}