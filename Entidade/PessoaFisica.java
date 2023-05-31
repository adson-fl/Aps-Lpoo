package Entidade;

import java.time.LocalDate;

public class PessoaFisica extends Cliente {
	
	private String nome;
	private Endereço endereço; 
	private Double limiteDeCredito;
	private String cpf;
	private LocalDate dataNascimento;
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica (String nome, Endereço endereço, Double limiteDeCredito, String cpf, LocalDate dataNascimento) {
		this.nome = nome;
		this.endereço = endereço;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	// retriçãao de validade 
	
	public void realizarCompra(double valorTotal) {
        if (valorTotal <= limiteDeCredito) {
            System.out.println("Compra realizada com sucesso!");
            limiteDeCredito -= valorTotal;
        } else {
            System.out.println("Limite de crédito excedido. Compra não realizada.");
        }

	}
}