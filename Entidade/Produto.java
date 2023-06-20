package Entidade;

public class Produto {
	
	private String nome;
	private Double preço;
	private String codigoDeBarra;
	
	public Produto() {
		
	}
	
	public Produto(String nome, Double preço, String codigoDeBarra) {
		this.nome = nome;
		this.preço = preço;
		this.codigoDeBarra = codigoDeBarra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreço() {
		return preço;
	}
	public void setpreço(double preço) {
		this.preço = preço;
	}

	public String getCodigoDeBarra() {
		return codigoDeBarra;
	}

	public void setCodigoDeBarra(String codigoDeBarra) {
		this.codigoDeBarra = codigoDeBarra;
	}
	
	// valor total da soma dos produtos  // acresentar produto
	public void totalProdut(double preço) {
		this.preço += preço;
		}
	
	// retira produto da compra // retira produto 
	public void retiraProdut(double preço) {
		this.preço -= preço;
	}
	
}
