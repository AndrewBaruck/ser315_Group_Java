ASU SER315 Group Java – Project ReadMe
--------------------------------------

This project is our team’s implementation of the Bike Racing Registration System for SER315.  
The purpose is to demonstrate one complete workflow, meaningful system behavior, error handling,  
and the use of design patterns within a CLI Java program.

--------------------------------------
1. What This Project Is
--------------------------------------

This program simulates a simplified bike racing registration system.  
For Deliverable 4, we focused on implementing one full workflow from the perspective of the Racer role.  
The Racer can log in, view races, register for a race, handle license requirements, and manage the  
races they are registered for.

Admin and Organizer roles exist, but only the Racer workflow is fully implemented as required.

--------------------------------------
2. How To Run The Program
--------------------------------------

REQUIREMENTS:
- Java 17+
- Terminal or IDE

RUNNING IN IDE:
1. Open the project in your IDE.
2. Make sure your SDK is set to Java 17+.
3. Open src/Main.java.
4. Right-click Main.java and select "Run".

RUNNING IN TERMINAL:
Navigate to the project folder and run:

javac src/**/*.java
java -cp src Main


--------------------------------------
3. User Accounts 
--------------------------------------

The program contains three preset users:

Admin account:    username = admin1     password = pass  
Organizer account: username = org1      password = pass  
Racer account:     username = racer1     password = pass

Only the Racer role has a full workflow for this deliverable.

--------------------------------------
4. Main Workflow Implemented (Racer)
--------------------------------------

After logging in as the Racer, the following menu appears:

1) Register For Race
2) Manage Current Races
3) Logout

REGISTER FOR RACE:
- The program displays all available races.
- If the Racer does not have a license, the system explains the error and allows them to register for one.
- The registration flow checks:
    * Valid license
    * Category requirement
    * Race capacity
- Successful registration adds the race to the Racer’s profile.

MANAGE CURRENT RACES:
- Displays all races the Racer is registered for.

LOGOUT:
- Ends the Racer session and returns to the login menu.

--------------------------------------
5. Design Patterns Used
--------------------------------------

STRATEGY PATTERN:
Used to switch between Admin, Organizer, and Racer user interfaces.
SystemController chooses the correct UI at runtime based on the user’s type.

BUILDER PATTERN:
Used for constructing Race objects.
Races have many attributes, and the Builder pattern keeps race creation clean and readable.

--------------------------------------
6. Error Cases Demonstrated
--------------------------------------

The system handles several error scenarios:
- Invalid login credentials
- Selecting an invalid race ID
- Missing license when attempting to register
- Registering for a race above the Racer’s category
- Registering for a full race
- Non-numeric input for menu selections
- Duplicate race registrations prevented

--------------------------------------
7. Notes and Limitations
--------------------------------------

- Admin and Organizer menus exist but are not fully implemented.
- The system uses in-memory data only.
