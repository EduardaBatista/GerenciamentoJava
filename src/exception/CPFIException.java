package exception;

public class CPFIException extends Exception {
    public CPFIException(){
        super("CPF com quantidade de digitos incorreto.");
    }
}
