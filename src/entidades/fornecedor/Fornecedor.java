package entidades.fornecedor;

import entidades.Pessoa;

public class Fornecedor extends Pessoa {
    public String endereco;
    public String cnpj;

    public Fornecedor(String nome, String cpf, int idade, String telefone, String endereco, String cnpj) {
        super(nome, cpf, idade, telefone);
        this.endereco = endereco;
        this.cnpj = cnpj;
    }
}
