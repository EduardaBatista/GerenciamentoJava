package entidades.cliente;

import dados.RepositorioClientes;
import exception.CPFIException;
import exception.UJCException;

public class CadastroCliente {
    RepositorioClientes clientes;

    public CadastroCliente(RepositorioClientes clientes) {
        this.clientes = clientes;
    }
    public void cadastrar(Cliente cliente) throws UJCException, CPFIException {
        if (cliente.cpf.length() != 11) {
            throw new CPFIException();
        }
        else if (cliente.getNome().length() < 6 || cliente.getNome().length() > 30) {
                throw new IllegalArgumentException("Nome inválido. Mínimo 6 caracteres, máximo 30 caracteres.");
            }else if (cliente.idade<18 || cliente.idade>=100){
                throw new IllegalArgumentException(" Usuário não corresponde a idade necessária para cadastro.");
            } else if ( cliente.telefone.length()<11 || cliente.telefone.length() >11 ) {
                throw new IllegalArgumentException("Números inválidos.");
            }else if (cliente.endereco == null){
                throw new IllegalArgumentException("Indereço vazio");
            }else{
                clientes.cadastrar(cliente);
            }
    }
}
