package dados;

import entidades.produto.Produto;

public interface RepositorioProduto {
    void cadastrar(Produto produto);
    Produto buscar(String nome);
}
