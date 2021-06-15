package modelo;

public class ProvaModelo {
	
	// Atributos
	private int codigoProva;
	private String nomeProva;
	
	// Construtor
	public ProvaModelo(int codigoProva, String nomeProva) {
		this.nomeProva = nomeProva;
		this.codigoProva = codigoProva;
	}
	
	// Get e Set
	
	public int getCodigoProva() {
		return codigoProva;
	}

	public void setCodigoProva(int codigoProva) {
		this.codigoProva = codigoProva;
	}

	public String getNomeProva() {
		return nomeProva;
	}

	public void setNomeProva(String nomeProva) {
		this.nomeProva = nomeProva;
	}
	
	// toString
	public String toString() {
		return nomeProva;
	}
	
	
	
}
