import yfinance as yf
import pandas as pd

def get_stock_data(symbols):
  """
  Fetches stock data (bid, ask, name, symbol) for a list of symbols.

  Args:
    symbols: A list of stock symbols (e.g., ["AAPL", "MSFT"])

  Returns:
    A pandas DataFrame containing the fetched data.
  """
  data = yf.download(symbols, period="1d") 
  data = data.loc[:, ['Adj Close']] 
  data.columns = ['Close']
  data['Symbol'] = data.index.get_level_values(1)
  data.reset_index(level=1, inplace=True)

  # Assuming you have a way to get company names (e.g., using a separate API call)
  # This is a simplified placeholder
  data['Name'] = data['Symbol'].map(lambda x: get_company_name(x)) 

  # Calculate bid and ask (replace with actual real-time data)
  data['Bid'] = data['Close'] - 0.1  # Placeholder - Replace with actual bid data
  data['Ask'] = data['Close'] + 0.1  # Placeholder - Replace with actual ask data

  return data

def get_company_name(symbol):
  """
  Placeholder function to get company name from symbol. 
  Replace with actual implementation using an appropriate API.
  """
  # Example: Simple lookup (replace with actual API call)
  company_names = {
      'AAPL': 'Apple Inc.',
      'MSFT': 'Microsoft Corporation',
      # ... add more mappings as needed ...
  }
  return company_names.get(symbol, 'Unknown')

# List of 10 stock symbols (replace with your desired list)
symbols = ['AAPL', 'MSFT', 'GOOG', 'AMZN', 'TSLA', 'NVDA', 'JPM', 'JNJ', 'V', 'PG']

# Get stock data
stock_data = get_stock_data(symbols)

# Create a CSV file
stock_data.to_csv('stock_data.csv', index=False) 

print("Stock data saved to stock_data.csv")