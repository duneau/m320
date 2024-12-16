

/** 
 * This class represents an exchange-traded option (ETO), which is a contract that gives the holder the right, but not the obligation, to buy or sell an underlying asset at a specific price1 (strike price) by a certain date (expiration date).   
 * An ETO inherits all properties and methods from the base class {@link ExchangeTradedInstrument} and adds specific properties for options contracts, such as strike price, expiration date, bid, ask, and option type.
 * @since 1.0
 * @author Nicolas Duneau
 * @see ExchangeTradedInstrument 
 **/


package ch.tbz.trading;

import java.sql.Date;

public class ExchangeTradedOption extends ExchangeTradedInstrument {
    
/**
 * The strike price of the option. The strike price is the price at which the holder of the option has the right to buy (call option) or sell (put option) the underlying asset.
 */
    private float strikePrice;

/**
 * The expiration date of the option. The expiration date is the last day on which the option can be exercised.
 */
    private Date expirationDate;

/**
 * The current bid price of the option. The bid price is the highest price that a buyer is willing to pay for the option.
 */
    private float bid;

/**
 * The current ask price of the option. The ask price is the lowest price that a seller is willing to sell the option for.
 */
    private float ask;

/**
 * The type of the option. The option type can be either "call" or "put".
 */
    private String optionType;


    /**
     * Creates a new ExchangeTradedOption object.
     * 
     * @param symbol the symbol of the option
     * @param name the name of the option
     * @param strikePrice the strike price of the option
     * @param expirationDate the expiration date of the option
     * @param bid the current bid price of the option
     * @param ask the current ask price of the option
     * @param optionType the type of the option ("call" or "put")
    **/

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
