package entidades.encomenda;

import dados.RepositorioEncomenda;

public class CadastroEncomenda {
    RepositorioEncomenda encomendas;

    public CadastroEncomenda(RepositorioEncomenda encomendas) {
        this.encomendas = encomendas;
    }
    public void cadastrar(Encomenda encomenda){
        if (encomenda.cliente == null){
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
