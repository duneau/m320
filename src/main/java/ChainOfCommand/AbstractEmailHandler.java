
public abstract class AbstractEmailHandler implements EmailHandler{
	
	private EmailHandler nextHandler;
	
	
	
	public void setNextHandler(EmailHandler handler){
		this.nextHandler = handler;
	}
	
	/**
	 * Main method to deal with the emails (strings)
	 */
	public void processHandler(String email){
		boolean wordFound = false;
		
		//if no words to match against, then this object can handle:
		if (this.matchingWords().length == 0){
			wordFound = true;
		} else {
			//look for matching words:
			for (String word : this.matchingWords()){
				if (email.indexOf(word) >= 0){
					wordFound = true;
					break;
				}
			}
		}
		
		if (wordFound){
			this.handleHere(email);
		} else {  //pass it on to the next handler:
			this.nextHandler.processHandler(email);
		}
		
		
	}
	
	protected abstract String[] matchingWords();
	protected abstract void handleHere(String email);
	
	
	/**
	 * This method builds the chain of responsibility. It is then called from
	 * an outside class (test class, etc.)
	 * @param email
	 */
	public static void handle(String email){
		
		//create handler objects here:
		EmailHandler spam = new SpamEmailHandler();
		EmailHandler sales = new SalesEmailHandler();
		EmailHandler general = new AllOtherEmails();
		
		//and create a chain of objects:
		spam.setNextHandler(sales);
		sales.setNextHandler(general);
		
		//pass the incoming email to the first handler:
		spam.processHandler(email);
		
	}
	

}
