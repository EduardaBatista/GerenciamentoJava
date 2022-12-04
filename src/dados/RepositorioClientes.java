package dados;
import entidades.cliente.Cliente;
public interface RepositorioClientes {
    void cadastrar(Cliente cliente);
    void atualizar(String cpf, Cliente cliente);
    boolean existe(String cpf);
    Cliente buscar(String cpf);
}
