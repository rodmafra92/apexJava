package principal;

public abstract class Padrao {

	// Somar
	public abstract void somar(int n1, int n2);
	
	// Subtrair
	public abstract void subtrair(int n1, int n2);
	
	// Multiplicar
	public void multiplicar (int n1, int n2) {
		System.out.println("A multiplica��o � "+(n1*n2));
	}
}
