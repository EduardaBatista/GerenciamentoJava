package entidades;

import dados.RepositorioClientes;
import dados.RepositorioClientesLista;
import dados.RepositorioClientesVetor;
import dados.RepositorioFuncionario;
import entidades.cliente.CadastroCliente;
import entidades.cliente.Cliente;
import entidades.funcionario.Funcionario;
import exception.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws UJCException, CPFIException, NIException, IDIException, TNIException, EIException {
        /*Scanner leitura = new Scanner(System.in);
        try{
            Cliente cliente1 = new Cliente();

            System.out.println("Digite seu nome:");
            String nome = leitura.nextLine();
            cliente1.setNome(nome);

            System.out.println("Digite seu CPF:");
            String cpf = leitura.nextLine();
            cliente1.setCpf(cpf);

            System.out.println("Digte sua idade:");
            int idade = leitura.nextInt();
            cliente1.setIdade(idade);

            System.out.println("Digite seu telefone:");
            String telefone = leitura.next();
            cliente1.setTelefone(telefone);

            System.out.println("Digite seu endereço:");
            String endereco = leitura.next();
            cliente1.setEndereco(endereco);
            RepositorioClientesVetor repo = new RepositorioClientesVetor(1);
            repo.cadastrar(cliente1);
            System.out.println(repo.buscar("71455439401"));

            cliente1.imprimirDados();
        } catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }*/
        RepositorioClientesVetor r = new RepositorioClientesVetor(100);
        Cliente cli = new Cliente("brunaa","71455439401",21,"81988173072","rua lala");
        Cliente cli2 = new Cliente("fulaaa","09255439401",22,"81988173072","rua 2");
        CadastroCliente nc = new CadastroCliente(r);
        nc.cadastrar(cli);
        nc.cadastrar(cli2);
        r.imprime();
    }

}

