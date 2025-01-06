
public class AllOtherEmails extends AbstractEmailHandler{

	@Override
	protected String[] matchingWords() {

		return new String[0];  //matches anything
	}

	@Override
	protected void handleHere(String email) {
		
		System.out.println("The email is handled by general enquiries....");
		
	}

}
