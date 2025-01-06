
public interface EmailHandler {
	
	
	//important: each handler sets a next handler class
	public void setNextHandler(EmailHandler handler);
	public void processHandler(String email);

}
