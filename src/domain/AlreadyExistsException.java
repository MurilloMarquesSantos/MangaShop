package domain;

public class AlreadyExistsException extends Exception{
    public AlreadyExistsException(){
        super("This email already has a account linked to");
    }
}
