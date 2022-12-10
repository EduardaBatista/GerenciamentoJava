package dados;

import entidades.encomenda.Encomenda;
import entidades.produto.Produto;

public class RepositorioProdutoVetor implements RepositorioProduto {
    Produto[] produtos;

    public RepositorioProdutoVetor(int t) {
        this.produtos = new Produto[t];
    }

    @Override
    public void cadastrar(Produto produto) {

        if (this.produtos[0] == null) {
            this.produtos[0] = produto;
        } else {
            for (int i = 0; i < produtos.length; i++) {
                if (this.produtos[i] == null) {
                    this.produtos[i] = produto;
                    break;
                }

            }
        }
    }
        @Override
        public Produto buscar (String nome){
            for(int i = 0; i < produtos.length; i++){
                if(this.produtos[i].getNome().equals(nome)){
                    return this.produtos[i];
                }
                break;
            }
            return null;
        }
}

