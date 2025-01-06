
public class SalesEmailHandler extends AbstractEmailHandler {

	@Override
	protected String[] matchingWords() {
		return new String[]{"buy", "purchase", "buying", "enquiry"};
	}

	@Override
	protected void handleHere(String email) {
		
		System.out.println("This email is handled by sales");
	}

}
