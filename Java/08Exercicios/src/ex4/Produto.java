package ex4;

public class Produto {
	private String produto, marca;
	private double valor;
	
	// Constructor
	public Produto(String produto, String marca, double valor) {
		this.produto = produto;
		this.marca = marca;
		this.valor = valor;
	}
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	//
	public String toString() {
		return this.produto;
	}
}
