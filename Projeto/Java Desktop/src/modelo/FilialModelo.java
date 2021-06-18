package modelo;

public class FilialModelo {
	
	private int codigo;
	private String filial;
	
	// Construtor
	public FilialModelo(int codigo, String filial) {
		this.codigo = codigo;
		this.filial = filial;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getFilial() {
		return filial;
	}

	public void setFilial(String filial) {
		this.filial = filial;
	}
	
	// toString
	public String toString() {
		return filial;
	}
	
}
