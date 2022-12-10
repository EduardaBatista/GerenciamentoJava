package exception;

public class IDIException extends Exception{
    public IDIException(){
        super("Usuário não corresponde a idade necessária para cadastro.");
    }
}
