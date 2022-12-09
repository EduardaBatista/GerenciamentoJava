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
        } else if (clientes.existe(cliente.cpf)) {
            throw new UJCException();
        }if ( cliente.telefone.length()<11 || cliente.telefone.length() >11 ) {
                throw new IllegalArgumentException("Números inválidos. Por favor, insira o DDD de seu estado. ");
        } else {
            clientes.cadastrar(cliente);
        }
    }
}
