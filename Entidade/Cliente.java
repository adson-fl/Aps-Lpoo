 package Entidade;

public abstract class Cliente{
	
	private String nome;
	private Endere�o endere�o; 
	private Double limiteDeCredito;
	
	public Cliente(){
		
	}
	
	 public Cliente(String nome, Endere�o endereco, Double limiteDeCredito) {
	        this.nome = nome;
	        this.endere�o = endereco;
	        this.limiteDeCredito = limiteDeCredito;
	    }

	    // Metodo para verificar limite 
	    public void realizarCompra(double valorTotal) {
	        if (valorTotal <= limiteDeCredito) {
	            System.out.println("Compra realizada com sucesso!");
	            limiteDeCredito -= valorTotal;
	        } else {
	            System.out.println("Limite de cr�dito excedido. Compra n�o realizada.");
	        }
	    }

	    // Getters e setters
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public Endere�o getEndereco() {
	        return endere�o;
	    }

	    public void setEndereco(Endere�o endereco) {
	        this.endere�o = endereco;
	    }

	    public Double getLimiteDeCredito() {
	        return limiteDeCredito;
	    }

	    public void setLimiteDeCredito(Double limiteDeCredito) {
	        this.limiteDeCredito = limiteDeCredito;
	    }	
	}



