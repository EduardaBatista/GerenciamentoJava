package exception;

public class NIException extends Exception{
    public NIException(){
        super ("Não foi possível realizar seu cadastro. Mínimo 6 caracteres, máximo 30 caracteres.");
    }
}
