package dados;

import entidades.cliente.Cliente;

public class RepositorioClientesVetor implements RepositorioClientes {
    Cliente [] clientes;
    public RepositorioClientesVetor (int t){
        this.clientes = new Cliente[t];
    }
    @Override
    public void cadastrar(Cliente cliente) {
        if(this.clientes[0] == null){
            this.clientes[0] = cliente;
        }else{
            for(int i = 0; i<clientes.length; i++){
                if(this.clientes[i] == null){
                    this.clientes[i] = cliente;
                    break;
                }
            }
        }
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
