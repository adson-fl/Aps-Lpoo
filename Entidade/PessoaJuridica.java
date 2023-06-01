package Entidade;

public class PessoaJuridica extends Cliente {
	
	private String nome;
	private Endereço endereço; 
	private Double limiteDeCredito;
	private String cnpj;
	private String inscricaoEstadual;
	
	public PessoaJuridica() {
		
	}
	
	public PessoaJuridica(String nome, Endereço endereço, Double limiteDeCredito, String cnpj,String inscricaoEstadual) {
		this.nome = nome;
		this.endereço = endereço;
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

	public Endereço getEndereço() {
		return endereço;
	}

	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
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
            System.out.println("Limite de crédito excedido. Compra não realizada.");
        }
	}
}
