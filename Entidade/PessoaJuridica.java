package Entidade;

public class PessoaJuridica extends Cliente {
	
	private String nome;
	private Endere�o endere�o; 
	private Double limiteDeCredito;
	private String cnpj;
	private String inscricaoEstadual;
	
	public PessoaJuridica() {
		
	}
	
	public PessoaJuridica(String nome, Endere�o endere�o, Double limiteDeCredito, String cnpj,String inscricaoEstadual) {
		this.nome = nome;
		this.endere�o = endere�o;
		this.limiteDeCredito = limiteDeCredito;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endere�o getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(Endere�o endere�o) {
		this.endere�o = endere�o;
	}

	public Double getLimiteDeCredito() {
		return limiteDeCredito;
	}

	public void setLimiteDeCredito(Double limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	} 
	
	public void realizarCompra(double valorTotal) {
        if (valorTotal <= limiteDeCredito) {
            System.out.println("Compra realizada com sucesso!");
            limiteDeCredito -= valorTotal;
        } else {
            System.out.println("Limite de cr�dito excedido. Compra n�o realizada.");
        }
	}
}
