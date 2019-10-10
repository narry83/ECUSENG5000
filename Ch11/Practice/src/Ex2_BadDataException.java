import java.io.IOException;


public class Ex2_BadDataException extends IOException{
	
	public Ex2_BadDataException() {
		   
	   }
	
	public Ex2_BadDataException(String message)
	{
		   super(message);
		}

}

