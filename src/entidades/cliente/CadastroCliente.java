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
        } else {
            clientes.cadastrar(cliente);
        }
    }
}
