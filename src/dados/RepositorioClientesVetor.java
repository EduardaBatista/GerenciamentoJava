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
    public void atualizar(String cpf, Cliente cliente){
        for(int i = 0; i<clientes.length; i++){
            if(this.clientes[i].getCpf().equals(cpf)){
                this.clientes[i] = cliente;
                break;
            }
        }
    }

    @Override
    public boolean existe(String cpf) {
        boolean aux = false;
        for(int i = 0; i<clientes.length; i++){
            if(this.clientes[i].getCpf().equals(cpf)){
                aux = true;
                break;
<<<<<<< HEAD
            }else if(this.clientes[i+1] == null){
                break;
            }

=======
            }
>>>>>>> ef10936105e31363b425ecfba9e26855dae9175c
        }
        return aux;
    }

    @Override
    public Cliente buscar(String cpf) {
        for(int i = 0; i < clientes.length; i++){
            if(this.clientes[i].getCpf().equals(cpf)){
                System.out.println("O usuario de CPF: "+cpf+" é o:");
                return this.clientes[i];
            }
            break;
        }
        return null;
    }
    public void imprime(){
        for(int i = 0; i < this.clientes.length; i++){
            System.out.println(this.clientes[i].getNome());
        }
    }
}
