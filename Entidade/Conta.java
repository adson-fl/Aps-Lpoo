package Entidade;

import java.time.LocalDate;

import TipoEnum.TipoCompra;

public class Conta {
	private Compra[] compras;
    private LocalDate dataVencimento;
    private double total;
    private Cliente cliente;

    public Conta() {
    }
    
    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.compras = new Compra[0];
        this.total = 0;
        this.dataVencimento = null;
    }

    public Compra[] getCompras() {
        return compras;
    }

    public void setCompras(Compra[] compras) {
        this.compras = compras;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getTotal() {
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void adicionarCompra(Compra compra) {
        if (compra.getTipo() == TipoCompra.APRAZO) {
            if (dataVencimento != null && dataVencimento.isBefore(LocalDate.now())) {
                System.out.println("Compra não permitida. Há uma conta vencida.");
                return;
            }
            dataVencimento = compra.getData().plusDays(5);
        }
        Compra[] novasCompras = new Compra[compras.length + 1];
        for (int i = 0; i < compras.length; i++) {
            novasCompras[i] = compras[i];
        }
        novasCompras[compras.length] = compra;
        compras = novasCompras;
        total += compra.getTotal();
    }
}


