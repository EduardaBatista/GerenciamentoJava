package entidades.funcionario;

import entidades.Pessoa;

public class Funcionario extends Pessoa {
    public double salario;
    public String cargo;

    public Funcionario(String nome, String cpf, int idade, String telefone, String cargo, String endereco, double salario) {
        super(nome, cpf, idade, telefone, endereco);
        this.cargo = cargo;
        this.salario = salario;
    }
    public void mostrarDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Idade: "+this.idade);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("Cargo: "+this.cargo);
        System.out.println("Endereço: "+this.endereco);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
