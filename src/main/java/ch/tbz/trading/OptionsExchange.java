/**
 * Created: Dec 15, 2024
 */
package ch.tbz.trading;

import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

public class OptionsExchange implements Exchange {
    
 
      
    private String exchangeName;
    private List<ExchangeTradedOption> tradedOptions;
    private double marketCap;

    
    // constructor with only exchangeName
    public OptionsExchange(String exchangeName) {
        this.exchangeName = exchangeName;
        // create an empty list of ExchangeTradedOptions objects
        this.tradedOptions = new ArrayList<>(); 

        Date expirationDate = new Date(2025, 3, 1); // March 1, 2025

        // Create option objects with sample data (replace with actual values)
        ExchangeTradedOption appleOption = new ExchangeTradedOption("AAPL", "Apple Inc.", 150.00f, expirationDate, 149.50f, 150.50f, "Call");
        ExchangeTradedOption amazonOption = new ExchangeTradedOption("AMZN", "Amazon.com Inc.", 120.00f, expirationDate, 119.00f, 121.00f, "Put");
        ExchangeTradedOption ibmOption = new ExchangeTradedOption("IBM", "International Business Machines Corp.", 100.00f, expirationDate, 99.00f, 101.00f, "Call");

        this.addTradedAsset(appleOption);
   

    }

    
    @Override
    public List<ExchangeTradedInstrument> getTradedAssets() {
        return tradedOptions; // Returns a list of Equity objects
    }


    // add a traded asset
    public void addTradedAsset(ExchangeTradedOption tradedAsset) {
        tradedOptions.add(tradedAsset);
    }



    
    public void printTradedInstruments() {
        for (ExchangeTradedOption option : tradedOptions) {
            System.out.println(option); 
        }
    }

    // getter
    public double getMarketCap() {
        return marketCap;
    }

    // getter
    public String getExchangeName() {
        return exchangeName;
    }

    // setter
    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }
    
    public String toString() {
        return "Option Exchange: " + getExchangeName() + " Market Cap: " + getMarketCap();
    }
    
}
