package entidades.fornecedor;

import entidades.Pessoa;

public class Fornecedor extends Pessoa {
    public String endereco;
    public String cnpj;

    public Fornecedor(String nome, String cpf, int idade, String telefone, String endereco, String cnpj) {
        super(nome, cpf, idade, telefone, endereco);
        this.endereco = endereco;
        this.cnpj = cnpj;
    }

    @Override
    public String getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
