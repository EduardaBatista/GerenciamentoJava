package exception;

public class ENException extends Exception{
    public ENException(){
        super("Estoque com valor negativo.");
    }
}
