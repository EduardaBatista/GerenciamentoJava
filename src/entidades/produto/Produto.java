package entidades.produto;

import entidades.fornecedor.Fornecedor;

public class Produto {
    public String nome;
    public int quantidade;
    public String tipo;
    public String validade;
    public Double preco;
    public Fornecedor fornecedor;

    public Produto(String nome, int quantidade, String tipo, String validade, Double preco, Fornecedor fornecedor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.validade = validade;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
