package Entidade;

import java.time.LocalDate;

public class Fatura {

    private Conta conta;
    private LocalDate dataQuitacao;
    private float juros;
    private int quantidadeParcelas;
    private Parcela[] parcelas;

    public Fatura() {
    	
    }
    
    // Construtor da classe
    public Fatura(Conta conta, LocalDate dataQuitacao, float juros, int quantidadeParcelas, Parcela[] parcelas) {
        this.conta = conta;
        this.dataQuitacao = dataQuitacao;
        this.juros = juros;
        this.quantidadeParcelas = quantidadeParcelas;
        this.parcelas = parcelas;
    }

    // M�todos getters e setters
    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public LocalDate getDataQuitacao() {
        return dataQuitacao;
    }

    public void setDataQuitacao(LocalDate dataQuitacao) {
        this.dataQuitacao = dataQuitacao;
    }

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }

    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(int quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public Parcela[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(Parcela[] parcelas) {
        this.parcelas = parcelas;
    }

    // M�todo para calcular os juros por atraso
    public float jurosPorAtraso() {
        // Implemente o c�lculo dos juros por atraso aqui
        return 0.0f;
    }

    // M�todo para calcular os juros por parcelamento
    public float jurosPorParcelamento() {
        // Implemente o c�lculo dos juros por parcelamento aqui
        return 0.0f;
    }
}
