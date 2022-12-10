package dados;

import entidades.encomenda.Encomenda;

public interface RepositorioEncomenda {
    void cadastrar(Encomenda encomenda);
    Encomenda buscar(String CPFcliente);
}
