/**
 * Created: Dec 15, 2024
 */
package ch.tbz.m320.D1;

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
