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

       

        // display the equities
        System.out.println("Equities on " + stockExchange.getExchangeName());
        
        stockExchange.printTradedInstruments();


        // create an Options exchange
        System.out.println();
        System.out.println("Options exchange");
        System.out.println();
        // ask the user for the name of the exchange
        exchangeName = inputString("Enter the name of the exchange for options: ");
        System.out.println();
        OptionsExchange optionsExchange = new OptionsExchange(exchangeName);

        // display the options
        System.out.println("Options on " + optionsExchange.getExchangeName());
        optionsExchange.printTradedInstruments();

    }

    
}
