package principal;

public class Eletronico extends Produto {
	
	// Imposto Federal
	public void ifd(double valor) {
		System.out.println("Imposto Federa - Eletrônico R$ " + (valor *0.1));
	}
	
	
	
}
