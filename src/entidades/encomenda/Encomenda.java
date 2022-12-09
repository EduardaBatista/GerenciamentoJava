package entidades.encomenda;

import entidades.cliente.Cliente;
import entidades.produto.Produto;

public class Encomenda {
    public String clienteNome;
    public Produto item;
    public String data;

    public Encomenda(String cliente, Produto item, String data) {
        this.clienteNome = cliente;
        this.item = item;
        this.data = data;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setCliente(String cliente) {
        this.clienteNome = cliente;
    }

    public Produto getItem() {
        return item;
    }

    public void setItem(Produto item) {
        this.item = item;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
