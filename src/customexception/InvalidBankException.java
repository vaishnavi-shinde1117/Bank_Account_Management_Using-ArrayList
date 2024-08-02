package customexception;

@SuppressWarnings("serial")
public class InvalidBankException extends Exception{
	public InvalidBankException(String msg) {
		super(msg);
	}


}
