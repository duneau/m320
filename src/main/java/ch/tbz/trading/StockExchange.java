/**
 * Created: Dec 15, 2024
 */
package ch.tbz.trading;

import java.util.ArrayList;
import java.util.List;

public class StockExchange implements Exchange {
    
    private String exchangeName;
    private List<ExchangeTradedStock> tradedStocks;
    private double marketCap;

    
 
    // constructor with only exchangeName 
    public StockExchange(String exchangeName) {
        this.exchangeName = exchangeName;
        // create an empty list of ExchangeTradedStock objects
        this.tradedStocks = new ArrayList<>(); 

        // Create 4 ExchangeTradedStock objects with bid and ask prices
        ExchangeTradedStock apple = new ExchangeTradedStock("AAPL", "Apple Inc.", 150.00f, 150.10f);
        ExchangeTradedStock google = new ExchangeTradedStock("GOOG", "Google LLC.", 2800.00f, 2800.50f);
        ExchangeTradedStock microsoft = new ExchangeTradedStock("MSFT", "Microsoft Corporation", 300.00f, 300.15f);
        ExchangeTradedStock amazon = new ExchangeTradedStock("AMZN", "Amazon.com Inc.", 110.00f, 110.12f);
  
        // Add the stocks to the exchange
        this.addTradedAsset(apple);
        this.addTradedAsset(google);
        this.addTradedAsset(microsoft);
        this.addTradedAsset(amazon);

    }


    // getter
    public String getExchangeName() {
        return exchangeName;
    }

    // setter
    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

 

    @Override
    public List<ExchangeTradedInstrument> getTradedAssets() {
        return tradedStocks; // Returns a list of Equity objects
    }


    // add a traded asset
    public void addTradedAsset(ExchangeTradedStock tradedAsset) {
        tradedStocks.add(tradedAsset);
    }



    // getter
    public double getMarketCap() {
        return marketCap;
    }

    // setter
    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    public void printTradedInstruments() {
        for (ExchangeTradedStock stock : tradedStocks) {
            System.out.println(stock); 
        }
    }

    
}
