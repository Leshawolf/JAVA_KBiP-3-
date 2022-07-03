package zad2;

public class PremiyaException extends Exception{
    public PremiyaException(String message){
        super(message);
    }

    public PremiyaException(String message, Throwable cause) {
        super(message, cause);
    }

    public PremiyaException(Throwable cause) {
        super(cause);
    }
}
