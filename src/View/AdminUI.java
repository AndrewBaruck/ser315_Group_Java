package View;

import Model.Admin;
import Model.User;

/**
 * Admin-specific UI for Strategy implementation.
 */
public class AdminUI implements RoleUI {

    @Override
    public void showRoleMenu(User user) {
        Admin admin = (Admin) user;

        System.out.println("===== Admin Menu =====");
        System.out.println("1) Manage Users");
        System.out.println("2) Manage System");
        System.out.println("3) Logout");
        // TODO: add input handling and calls to AdminController when ready
    }

    public void manageSystem() {
        // TODO: hook to AdminController
    }
}