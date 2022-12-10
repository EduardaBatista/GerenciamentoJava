package entidades.funcionario;
import dados.RepositorioFuncionario;
import exception.CDFException;
public class CadastroFuncionario {
    RepositorioFuncionario funcionarios;

    public void CadastroFuncionario(RepositorioFuncionario funcionarios) {this.funcionarios = funcionarios;}
    public void ficha (Funcionario funcionario) throws CDFException{
        if (funcionario.salario != 1200){
            throw new IllegalArgumentException("Salário não compativél.");
        } else if (funcionario.cargo == null) {
            throw new IllegalArgumentException("cargo inválido");
        }else {
            cadastro(funcionario);
        }
    }

    private void cadastro(Funcionario funcionario) {
    }
}
