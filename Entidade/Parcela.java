package Entidade;

import java.time.LocalDate;

import TipoEnum.TipoPagamento;

public class Parcela {
	
	    private LocalDate dataVencto;
	    private Double valor;
	    private Float juros;
	    private TipoPagamento tipo; // enum 
	    private LocalDate dataPagto;

	    public Parcela(LocalDate dataVencto, double valor, float juros, TipoPagamento tipo, LocalDate dataPagto) {
	        this.dataVencto = dataVencto;
	        this.valor = valor;
	        this.juros = juros;
	        this.tipo = tipo;
	        this.dataPagto = dataPagto;
	    }

	    public LocalDate getDataVencto() {
	        return dataVencto;
	    }

	    public void setDataVencto(LocalDate dataVencto) {
	        this.dataVencto = dataVencto;
	    }

	    public double getValor() {
	        return valor;
	    }

	    public void setValor(double valor) {
	        this.valor = valor;
	    }

	    public float getJuros() {
	        return juros;
	    }

	    public void setJuros(float juros) {
	        this.juros = juros;
	    }

	    public TipoPagamento getTipo() {
	        return tipo;
	    }

	    public void setTipo(TipoPagamento tipo) {
	        this.tipo = tipo;
	    }

	    public LocalDate getDataPagto() {
	        return dataPagto;
	    }

	    public void setDataPagto(LocalDate dataPagto) {
	        this.dataPagto = dataPagto;
	    }
	    
	    /*public float jurosPorParcelamento() {
	        float valorFinal = (float) (getTotalFatura() * (1 + juros));
			if (conta.getClass().getTipoPagamento() == TipoPagamento.DINHEIRO || conta.getClass().getTipoPagamento() == TipoPagamento.PIX) {
	            return valorFinal * 0.02f;
	        } else if (conta.getClass().getTipoPagamento() == TipoPagamento.CARTAO_DEBITO) {
	            return valorFinal * 0.04f + valorFinal * 0.013f;
	        } else if (conta.getClass().getTipoPagamento() == TipoPagamento.CARTAO_CREDITO) {
	            return valorFinal * 0.06f + valorFinal * 0.018f;
	        }
	        return 0.0f;
	    }

		private float getTotalFatura() {
			return 0;
		}*/
}
