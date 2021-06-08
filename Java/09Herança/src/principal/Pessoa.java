package principal;

// No java não há herança multipla, sendo assim só é possivel herdar uma classe.

public class Pessoa extends Cargo{
	
	// Atributos
	private String nome;
	private int idade;
	
	// Construtor
	public Pessoa(String nome, String cargo, int idade, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.salario = salario;
		
		listarPessoa();
		listarCargo();
	}
	
	//Método para listar dados
	private void listarPessoa() {
		System.out.println("Nome:" + nome);
		System.out.println("Idade: " + idade);
	}
	
}
