/**
 * Created: Dec 15, 2024
 * @version: 1.0
 * @author: Nicolas Duneau
 */
package ch.tbz.trading;

import java.util.List;



interface Exchange {
    
    String getExchangeName();
    List<ExchangeTradedInstrument> getTradedAssets();
    double getMarketCap(); 
}
