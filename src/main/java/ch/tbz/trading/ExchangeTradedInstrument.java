/**
 * Created: Dec 15, 2024
 */
package ch.tbz.trading;

public abstract class ExchangeTradedInstrument {
    

    private String symbol;
    private String name;

    // constructor
    public ExchangeTradedInstrument(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    // getter
    public String getSymbol() {
        return symbol;
    }

    // setter
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }
    
}
