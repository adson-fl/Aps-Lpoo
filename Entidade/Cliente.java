 package Entidade;

public abstract class Cliente{
	
	private String nome;
	private Endereço endereço; 
	private Double limiteDeCredito;
	
	public Cliente(){
		
	}
	
	 public Cliente(String nome, Endereço endereco, Double limiteDeCredito) {
	        this.nome = nome;
	        this.endereço = endereco;
	        this.limiteDeCredito = limiteDeCredito;
	    }

	    // Metodo para verificar limite 
	    public void realizarCompra(double valorTotal) {
	        if (valorTotal <= limiteDeCredito) {
	            System.out.println("Compra realizada com sucesso!");
	            limiteDeCredito -= valorTotal;
	        } else {
	            System.out.println("Limite de crédito excedido. Compra não realizada.");
	        }
	    }

	    // Getters e setters
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public Endereço getEndereco() {
	        return endereço;
	    }

	    public void setEndereco(Endereço endereco) {
	        this.endereço = endereco;
	    }

	    public Double getLimiteDeCredito() {
	        return limiteDeCredito;
	    }

	    public void setLimiteDeCredito(Double limiteDeCredito) {
	        this.limiteDeCredito = limiteDeCredito;
	    }	
	}



