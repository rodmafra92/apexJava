package principal;

public class Produto {
	
	// Imposto Municipal
	public void im(double valor){
		System.out.println("Imposto Municipal - Padrão R$ " + (valor * 0.02));
	}
	
	// Imposto Estadual
	public void ie(double valor) {
		System.out.println("Imposto Estadual - Padrãp R$ " + (valor * 0.04));
	}
	
	// Imposto Federal
	public void ifd(double valor) {
		System.out.println("Imposto Federal - Padrão R$ "+(valor * 0.05));
	}
	
}
