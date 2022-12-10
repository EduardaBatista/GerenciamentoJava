package dados;

import entidades.cliente.Cliente;
import entidades.funcionario.Funcionario;

public class RepositorioFuncionarioVetor implements RepositorioFuncionario{
    Funcionario [] funcionarios;
    public RepositorioFuncionarioVetor (int t){
        this.funcionarios = new Funcionario[t];
    }
    @Override
    public void cadastrar(Funcionario funcionario) {
        if(this.funcionarios[0] == null){
            this.funcionarios[0] = funcionario;
        }else{
            for(int i = 0; i<funcionarios.length; i++){
                if(this.funcionarios[i] == null){
                    this.funcionarios[i] = funcionario;
                    break;
                }
            }
        }
    }

    @Override
    public boolean existe(String cpf) {
        boolean aux = false;
        for(int i = 0; i<funcionarios.length; i++){
            if(this.funcionarios[i].getCpf().equals(cpf)){
                aux = true;
                break;
            }
        }
        return aux;
    }

    @Override
    public Funcionario busca(String cpf) {
        for(int i = 0; i < funcionarios.length; i++){
            if(this.funcionarios[i].getCpf().equals(cpf)){
                System.out.println("O usuario de CPF: "+cpf+" é o:");
                return this.funcionarios[i];
            }
            break;
        }
        return null;
    }
}
