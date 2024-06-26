package domain;

public class InvalidLoginException extends Exception{

    public InvalidLoginException(){
        super("Invalid email or password");
    }
}
