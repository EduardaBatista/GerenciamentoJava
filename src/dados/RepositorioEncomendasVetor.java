package dados;

import entidades.cliente.Cliente;
import entidades.encomenda.Encomenda;

public class RepositorioEncomendasVetor implements RepositorioEncomenda{
    Encomenda[] encomendas;
    public RepositorioEncomendasVetor (int t){
        this.encomendas = new Encomenda[t];
    }

    @Override
    public void cadastrar(Encomenda encomenda) {
        if(this.encomendas[0] == null){
            this.encomendas[0] = encomenda;
        }else{
            for(int i = 0; i<encomendas.length; i++){
                if(this.encomendas[i] == null){
                    this.encomendas[i] = encomenda;
                    break;
                }
            }
        }
    }

    @Override
    public Encomenda buscar(String CPFcliente) {
        for(int i = 0; i < encomendas.length; i++){
            if(this.encomendas[i].getCliente().getCpf().equals(CPFcliente)){
                    System.out.println("O usuario de CPF: "+CPFcliente+" é o:");
                return this.encomendas[i];
            }
            break;
        }
        return null;
    }

}
