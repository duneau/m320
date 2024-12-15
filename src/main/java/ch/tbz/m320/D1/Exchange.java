/**
 * Created: Dec 15, 2024
 */
package ch.tbz.m320.D1;

import java.util.List;

interface Exchange {
    
    String getExchangeName();
    List<ExchangeTradedInstrument> getTradedAssets();
    double getMarketCap(); 
}
