package entidades.encomenda;

import entidades.cliente.Cliente;
import entidades.produto.Produto;

public class Encomenda {
    public Cliente cliente;
    public Produto item;
    public String data;

    public Encomenda(Cliente cliente, Produto item, String data) {
        this.cliente = cliente;
        this.item = item;
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
