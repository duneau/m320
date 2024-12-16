/**
 * Created: Dec 15, 2024
 */
package ch.tbz.trading;

public class ExchangeTradedStock extends ExchangeTradedInstrument {
    

    private float bid;
    private float ask;

    // constructor
    public ExchangeTradedStock(String symbol, String name, float bid, float ask) {
        super(symbol, name);
        this.bid = bid;
        this.ask = ask;
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

    public String toString() {
        return "Stock: " + getSymbol() + " " + getName() + " Bid: " + getBid() + " Ask: " + getAsk() + " Spread: " + getSpread();
    }  
    
 

}
