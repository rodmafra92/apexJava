package principal;

public class Produto {
	
	// Imposto Municipal
	public void im(double valor){
		System.out.println("Imposto Municipal - Padr�o R$ " + (valor * 0.02));
	}
	
	// Imposto Estadual
	public void ie(double valor) {
		System.out.println("Imposto Estadual - Padr�p R$ " + (valor * 0.04));
	}
	
	// Imposto Federal
	public void ifd(double valor) {
		System.out.println("Imposto Federal - Padr�o R$ "+(valor * 0.05));
	}
	
}
