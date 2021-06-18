package modelo;

public class FuncionarioModelo {
	
	// Atributos
	private int codigo;
	private String nome, cargo, turno;
	
	// Construtor
	public FuncionarioModelo(int codigo, String nome, String cargo, String turno){
		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
		this.turno = turno;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	
}
