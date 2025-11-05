
package model;

import java.time.LocalDate;

public class License {
    private int ID;
    private int Category;
    private LocalDate DateCreated;
    private LocalDate expDate;

    public void createLicence(String name, CreditCard card) { /* TODO */ }
    public void deleteLicense() { /* TODO */ }
    public boolean isValid() { return false; }

    // Getters
    public int getID() { return ID; }
    public int getCategory() { return Category; }
    public LocalDate getDateCreated() { return DateCreated; }
    public LocalDate getExpDate() { return expDate; }
}
