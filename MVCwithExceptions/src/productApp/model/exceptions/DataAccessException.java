package productApp.model.exceptions;

//Wrapper to wrap excetions
public class DataAccessException extends Exception {

	public DataAccessException(Throwable cause) {
		super(cause);
	}
}
