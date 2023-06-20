package Entidade;

public class Produto {
	
	private String nome;
	private Double pre�o;
	private String codigoDeBarra;
	
	public Produto() {
		
	}
	
	public Produto(String nome, Double pre�o, String codigoDeBarra) {
		this.nome = nome;
		this.pre�o = pre�o;
		this.codigoDeBarra = codigoDeBarra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPre�o() {
		return pre�o;
	}
	public void setpre�o(double pre�o) {
		this.pre�o = pre�o;
	}

	public String getCodigoDeBarra() {
		return codigoDeBarra;
	}

	public void setCodigoDeBarra(String codigoDeBarra) {
		this.codigoDeBarra = codigoDeBarra;
	}
	
	// valor total da soma dos produtos  // acresentar produto
	public void totalProdut(double pre�o) {
		this.pre�o += pre�o;
		}
	
	// retira produto da compra // retira produto 
	public void retiraProdut(double pre�o) {
		this.pre�o -= pre�o;
	}
	
}
