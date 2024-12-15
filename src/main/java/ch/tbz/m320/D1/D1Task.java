/**
 * Created: Dec 15, 2024
 */
package ch.tbz.m320.D1;

// Imports Input functions
import static ch.tbz.lib.Input.*; 

public class D1Task {

    public static void main(String[] args) {
      
        System.out.println("Market simulator");
        System.out.println();

        // ask the user for the name of the exchange
        String exchangeName = inputString("Enter the name of the exchange for equities: ");
        System.out.println();
        StockExchange stockExchange = new StockExchange(exchangeName);

        // ask the user for the number of equities
        int numEquities = inputInt("Enter the number of equities: ");
        System.out.println();

        // ask the user for the equities
        for (int i = 0; i < numEquities; i++) {
            String symbol = inputString("Enter the symbol for equity " + (i + 1) + ": ");
            String name = inputString("Enter the name for equity " + (i + 1) + ": ");
            float bid = inputFloat("Enter the bid price for equity " + (i + 1) + ": ");
            float ask = inputFloat("Enter the ask price for equity " + (i + 1) + ": ");
            ExchangeTradedStock tradedAsset = new ExchangeTradedStock(symbol, name, bid, ask);
            stockExchange.addTradedAsset(tradedAsset);
            System.out.println();
        }

        // display the equities
        System.out.println("Equities on " + stockExchange.getExchangeName());
        
        stockExchange.printTradedInstruments();
        
    }

    
}
