package dados;

import entidades.fornecedor.Fornecedor;

public interface RepositorioFornecedor {
    void cadastrar(Fornecedor fornecedor);
    boolean existe(String cnpj);
    Fornecedor buscar(String cnpj);
}
