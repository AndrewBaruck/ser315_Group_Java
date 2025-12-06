package Model;

import java.time.LocalDate;

public class License {

    private int ID;
    private int category;
    private LocalDate creationDate;
    private LocalDate expirationDate;
    private CreditCard creditCard;
    private String racerName;
    private String payment;

    public License(String racerName, String payment) {
        this.racerName = racerName;
        this.payment = payment;
    }

    public License() {
        // default license used by Admin or other system tasks
    }


    public void createLicence(String name, CreditCard card){
        this.racerName = name;
        this.creditCard = card;
        this.creationDate = LocalDate.now();
        this.expirationDate = creationDate.plusYears(1);
        this.category = 1;
        this.ID = 123456789;

    }
    public void deleteLicense(){
        this.racerName = null;
        this.creditCard = null;
        this.creationDate = null;
        this.expirationDate = null;
        this.category = 0;
        this.ID = 0;
    }
    public boolean isValid(){
        if (this.ID == 0 || LocalDate.now().isAfter(this.expirationDate)) {
            return false;
        }
        return true;
    }

    public Object getLicenseID() {
        return this.ID;
    }
}
