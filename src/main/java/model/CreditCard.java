
package model;

import java.time.LocalDate;

public class CreditCard {
    private int cardNumber;
    private LocalDate expDate;
    private String Name;
    private String billingAddress;

    // Getters/Setters for future use
    public int getCardNumber() { return cardNumber; }
    public void setCardNumber(int cardNumber) { this.cardNumber = cardNumber; }
    public LocalDate getExpDate() { return expDate; }
    public void setExpDate(LocalDate expDate) { this.expDate = expDate; }
    public String getName() { return Name; }
    public void setName(String name) { Name = name; }
    public String getBillingAddress() { return billingAddress; }
    public void setBillingAddress(String billingAddress) { this.billingAddress = billingAddress; }
}
