package dados;

import entidades.cliente.Cliente;

public class RepositorioClientesLista implements RepositorioClientes {

    @Override
    public void cadastrar(Cliente cliente) {

    }

    @Override
    public void atualizar(String cpf, Cliente cliente) {

    }

    @Override
    public boolean existe(String cpf) {
        return false;
    }

    @Override
    public Cliente buscar(String cpf) {
        return null;
    }
}
