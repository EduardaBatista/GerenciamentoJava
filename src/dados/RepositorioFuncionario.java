package dados;

import entidades.cliente.Cliente;
import entidades.funcionario.Funcionario;

public interface RepositorioFuncionario {
    void cadastrar(Funcionario funcionario);
    boolean existe(String cpf);
    Funcionario busca(String cpf);
}
