package entidades.fornecedor;
import dados.RepositorioFornecedor;
import dados.RepositorioFuncionario;
import exception.CDFRException;

public class CadastroFornecedor {
    RepositorioFornecedor fornecedor;
    public void CadastroFornecedor (RepositorioFornecedor fornecedor) {this.fornecedor = fornecedor;}
    public void cadastro (Fornecedor fornecedor) throws CDFRException{
        if (fornecedor.endereco.length() != 11){
            throw new CDFRException();
        } else if (fornecedor.cnpj.length() != 14) {
            throw new IllegalArgumentException("CNPJ inválido");
        }else {
            cadastro(fornecedor);
        }

    }
}