package entidades;

public abstract class Pessoa{
    public String nome;         //>=6 e <=30
    public  String cpf;        // 11 digitos
    public int idade;         // >=18 e <=100
    public String telefone;  //>=12 e <=20
    public String endereco;

    public Pessoa() { }



    public Pessoa(String nome, String cpf, int idade, String telefone, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() < 6 || nome.length() > 30) {
            throw new IllegalArgumentException("Nome inválido. Mínimo 6 caracteres, máximo 30 caracteres.");
        } else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length() <=10 ){
            throw new IllegalArgumentException(" Cpf inválido");
        }
        else
            this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade<18 || idade>=100){
            throw new IllegalArgumentException(" Usuário não corresponde a idade necessária para cadastro.");
        } else{
            this.idade = idade;
    }
    }

    public String getTelefone() {
        return telefone;
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;

    }
    public void imprimirDados(){
        System.out.println("Nome:" +nome);
        System.out.println("Cpf:" +cpf);
        System.out.println("idade:" + idade);
        System.out.println("telefone:"+ telefone);
        System.out.println("endereco:" + endereco);
    }
}
