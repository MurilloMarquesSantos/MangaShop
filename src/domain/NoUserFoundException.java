package domain;

public class NoUserFoundException extends Exception{
    public NoUserFoundException(){
        super("No user found");
    }
}
