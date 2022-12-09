package entidades.encomenda;

import dados.RepositorioEncomenda;
import exception.CPFIException;

public class CadastroEncomenda {
    RepositorioEncomenda encomendas;

    public CadastroEncomenda(RepositorioEncomenda encomendas) {
        this.encomendas = encomendas;
    }
    public void cadastrarEncomenda(Encomenda encomenda){
        if (encomenda.clienteNome.length() < 6 && encomenda.clienteNome.length() > 30){
            throw new IllegalArgumentException();
        }else if(encomenda.item == null){
            throw new IllegalArgumentException();
        }else if(encomenda.data == null){
            throw new IllegalArgumentException();
        }else{
            encomendas.cadastrar(encomenda);
            System.out.println("Cadastro realizado.");
        }
    }
}
