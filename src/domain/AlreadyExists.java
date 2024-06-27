package domain;

public class AlreadyExists extends Exception{
    public AlreadyExists(){
        super("This email already has a account linked to");
    }
}
