/**
 * Created: Dec 15, 2024
 */
package ch.tbz.trading;

import java.sql.Date;

public class ExchangeTradedOption extends ExchangeTradedInstrument {
    

    private float strikePrice;
    private Date expirationDate;
    private float bid;
    private float ask;
    private String optionType;

    
    // constructor
    public ExchangeTradedOption(String symbol, String name, float strikePrice, Date expirationDate, float bid, float ask, String optionType) {
        super(symbol, name);
        this.strikePrice = strikePrice;
        this.expirationDate = expirationDate;
        this.bid = bid;
        this.ask = ask;
        this.optionType = optionType;
    }

    // getter
    public float getBid() {
        return bid;
    }

    // setter
    public void setBid(float bid) {
        this.bid = bid;
    }

    // getter
    public float getAsk() {
        return ask;
    }

    // setter
    public void setAsk(float ask) {
    
        this.ask = ask;
    }

    public float getSpread() {
        return ask - bid;
    }

    public String getOptionType() {
        return optionType;
    }

   public String toString() {

        return "Option: " + getSymbol() + " " + getName() + " Strike Price: " + strikePrice + " Expiration Date: " + expirationDate + " Bid: " + getBid() + " Ask: " + getAsk() + " Spread: " + getSpread() + " Option Type: " + getOptionType();
    }
    
 

}
