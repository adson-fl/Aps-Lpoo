package Entidade;

import java.util.Date;

public class PessoaFisica extends Cliente {
	
	private String nome;
	private Endere�o endere�o; 
	private Double limiteDeCredito = 1000.00;
	private String cpf;
	private Date dataNascimento; 
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica (String nome, Endere�o endere�o, Double limiteDeCredito, String cpf, Date dataNascimento) {
		this.nome = nome;
		this.endere�o = endere�o;
		this.limiteDeCredito = limiteDeCredito;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	// retri��ao de validade 
	
	public void realizarCompra(double valorTotal) { // retirado 
        if (valorTotal <= limiteDeCredito) {
            System.out.println("Compra realizada com sucesso!");
            limiteDeCredito -= valorTotal;
        } else {
            System.out.println("Limite de cr�dito excedido. Compra n�o realizada.");
        }

	}

	@Override
	public String toString() {
		 return "NOME: " + nome 
				+ "\n ENDERE�O: " + endere�o 
				+ "\n LIMITE DE CREDITO: " + limiteDeCredito
				+ "\n CPF: " + cpf 
				+ "\n DATA DE NACIMETO: " + dataNascimento;
	}
}