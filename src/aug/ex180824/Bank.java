package aug.ex180824;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Bank {

    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Integer add(Bank bankName){
        if(!bankName.currency.equalsIgnoreCase("INR")){
            // throws exception that is not supported USD  /  GBP   / INR

            try {
                throw new Exception("Currency doesnt Match");  // Custom MisMatch Exception
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        Integer sum = this.amount + bankName.amount;

        return sum;
    }
}
