package ex2;

public class Cursos {
	
	// Atributos
	private String nome;
	private double valor;
	
	// Construtor
	public Cursos(String nome, double valor) {
		this.nome =nome;
		this.valor = valor;
	}
	
	//Get e Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	// Metodo toString
	public String toString() {
		return this.nome;
	}	
}
