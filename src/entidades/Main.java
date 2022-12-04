package entidades;

import dados.RepositorioClientes;
import dados.RepositorioClientesLista;
import dados.RepositorioClientesVetor;
import dados.RepositorioFuncionario;
import entidades.cliente.CadastroCliente;
import entidades.cliente.Cliente;
import entidades.funcionario.Funcionario;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = leitura.nextLine();

        System.out.println("Digite seu CPF:");
        String cpf = leitura.nextLine();

        System.out.println("Digte sua idade:");
        int idade = leitura.nextInt();

        System.out.println("Digite seu telefone:");
        String telefone = leitura.next();

        System.out.println("Digite seu endereço:");
        String endereco = leitura.next();
        try {
            Cliente cliente1 = new Cliente();
            cliente1.setNome(nome);
            cliente1.setCpf(cpf);
            cliente1.setIdade(idade);
            cliente1.setTelefone(telefone);
            cliente1.setEndereco(endereco);
        } catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}

