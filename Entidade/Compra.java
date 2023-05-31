package Entidade;

import java.time.LocalDate;

import TipoEnum.TipoCompra;

public class Compra {
	
	private Produto[] produtos;
    private LocalDate data;
    private Cliente cliente;
    private TipoCompra tipo;

    // Construtor da classe (falta o enum tipo)
    public Compra(Produto[] produtos, LocalDate data, TipoCompra tipo,Cliente cliente) {
        this.produtos = produtos;
        this.data = data;
        this.cliente = cliente;
        this.tipo = tipo;
    }
    
    // Métodos getters e setters
    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoCompra getTipo() {
        return tipo;
    }

    public void setTipo(TipoCompra tipo) {
        this.tipo = tipo;
    }

    public double getTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreço();
        }
        return total;
    }

}
