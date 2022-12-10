package dados;

import entidades.cliente.Cliente;
import entidades.fornecedor.Fornecedor;

public class RepositorioFornecedorVetor implements RepositorioFornecedor{
    Fornecedor [] fornecedores;

    public RepositorioFornecedorVetor (int t){
        this.fornecedores = new Fornecedor[t];
    }
    @Override
    public void cadastrar(Fornecedor fornecedor) {
        if(this.fornecedores[0] == null){
            this.fornecedores[0] = fornecedor;
        }else{
            for(int i = 0; i<fornecedores.length; i++){
                if(this.fornecedores[i] == null){
                    this.fornecedores[i] = fornecedor;
                    break;
                }
            }
        }
    }

    @Override
    public boolean existe(String cnpj) {
        boolean aux = false;
        for(int i = 0; i<fornecedores.length; i++){
            if(this.fornecedores[i].getCnpj().equals(cnpj)){
                aux = true;
                break;
            }
        }
        return aux;
    }

    @Override
    public Fornecedor buscar(String cnpj) {
        for(int i = 0; i < fornecedores.length; i++){
            if(this.fornecedores[i].getCnpj().equals(cnpj)){
                System.out.println("O usuario de CPF: "+cnpj+" é o:");
                return this.fornecedores[i];
            }
            break;
        }
        return null;
    }
}
