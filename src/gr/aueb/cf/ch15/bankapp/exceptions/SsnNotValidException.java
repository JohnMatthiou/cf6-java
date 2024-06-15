package gr.aueb.cf.ch15.bankapp.exceptions;

public class SsnNotValidException extends Exception{
    public static final long serialVersionUID = -123456789L;

    public SsnNotValidException(String ssn) {
        super("Ssn: " + ssn + " not valid");
    }
}
