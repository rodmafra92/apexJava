package ex4;

public class Quantidade {
	private String produto, marca;
	private double valor,total;
	private int quantidade;
	
	public Quantidade(String produto, String marca, double valor, int quantidade,double total) {
		this.produto = produto;
		this.marca = marca;
		this.valor = valor;
		this.quantidade = quantidade;
		this.total = total;	
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

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
