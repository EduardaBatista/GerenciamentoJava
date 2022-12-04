package entidades.cliente;

import entidades.encomenda.Encomenda;
import entidades.Pessoa;
import entidades.produto.Produto;

public class Cliente extends Pessoa {
    public Cliente() { }
    public Cliente(String nome, String cpf, int idade, String telefone, String endereco) {
        super(nome, cpf, idade, telefone, endereco);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
