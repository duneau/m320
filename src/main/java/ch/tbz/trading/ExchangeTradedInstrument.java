/**
 * This abstract class represents an exchange-traded instrument (ETI). An ETI is a security that is traded on a stock exchange.
 * This class provides common properties and methods for all ETIs, such as symbol and name.
 * @since 1.0
 * @author Nicolas Duneau 
 */ 

package ch.tbz.trading;

public abstract class ExchangeTradedInstrument {
    
    /**
     * The symbol of the ETI. The symbol is a unique identifier for the ETI on the exchange.
     */
    private String symbol;

    /**
     * The name of the ETI. The name is a human-readable description of the ETI.
     */
    private String name;

    /**
     * Creates a new ExchangeTradedInstrument object.
     * 
     * @param symbol the symbol of the ETI
     * @param name the name of the ETI
     */

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
