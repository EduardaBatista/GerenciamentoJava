package entidades.produto;

import dados.RepositorioProduto;
import exception.CDPException;

public class CadastroProduto{
    RepositorioProduto produtos;

    public CadastroProduto(RepositorioProduto produtos) { this.produtos = produtos;}
    public void cadastro (Produto produto) throws CDPException {
        if (produto.nome.length() != 6) {
            throw new CDPException();
        } else if (produto.getQuantidade() !=0){
            throw new  IllegalArgumentException("Quantidade produto inválido");
        } else if (produto.tipo == null) {
            throw new IllegalArgumentException("Produto fora dos caracteres.");
        } else if (produto.validade.length() != 8) {
            throw new IllegalArgumentException("erro na validade");
        } else if (produto.preco == null) {
            throw new IllegalArgumentException("Peço inválido");
        }else{
            produtos.cadastrar(produto);
        }
    }
    }
