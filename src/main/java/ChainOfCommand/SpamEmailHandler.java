
public class SpamEmailHandler extends AbstractEmailHandler{

	
	@Override
	protected String[] matchingWords() {
		
		return new String[]{"viagra", "pills", "medicine"};
	}

	@Override
	protected void handleHere(String email) {

		System.out.println("This is a spam email");
		
	}
	
	

}
