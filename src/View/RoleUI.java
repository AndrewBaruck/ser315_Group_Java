package View;

import Model.User;

/**
 * Strategy interface for role-specific user interfaces.
 * Each concrete implementation (AdminUI, OrganizerUI, RacerUI)
 * is responsible for showing the appropriate menu for that role.
 */
public interface RoleUI {

    /**
     * Entry point for the UI of a logged-in user.
     * Implementations can loop on menus, read input, and call controllers.
     *
     * @param user the logged-in user for this session
     */
    void showRoleMenu(User user);
}