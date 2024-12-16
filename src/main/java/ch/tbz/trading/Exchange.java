/**
 * Created: Dec 15, 2024
 */
package ch.tbz.trading;

import java.util.List;

interface Exchange {
    
    String getExchangeName();
    List<ExchangeTradedInstrument> getTradedAssets();
    double getMarketCap(); 
}
