package entidades.cliente;

import dados.RepositorioClientes;
import exception.*;

public class CadastroCliente {
    RepositorioClientes clientes;

    public CadastroCliente(RepositorioClientes clientes) {
        this.clientes = clientes;
    }
    public void cadastrar(Cliente cliente) throws UJCException, CPFIException, NIException, IDIException,TNIException, EIException{
        if (cliente.cpf.length() != 11) {
            throw new CPFIException();
        } else if (clientes.existe(cliente.cpf) == true) {
            throw new UJCException();
        } else if (cliente.getNome().length() < 6 || cliente.getNome().length() > 30) {
                throw new NIException();
            }else if (cliente.idade<18 || cliente.idade>=100){
                throw new IDIException();
            } else if ( cliente.telefone.length()<11 || cliente.telefone.length() >11 ) {
                throw new TNIException();
            }else if (cliente.endereco == null){
                throw new EIException();
            }else{
                clientes.cadastrar(cliente);
            }
    }
}
