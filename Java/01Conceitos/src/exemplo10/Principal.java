package exemplo10;

public class Principal {

	public static void main(String[] args) {
		
		// Vetor
		String[] nomes = { "Alice", "Bruno", "Camila"};
		
		//System.out.println(nomes[0]);
		
		//Contar nomes
		System.out.println(nomes.length);
		
		// La�o
		for(int indice=0; indice < nomes.length; indice ++) {
			System.out.println(nomes[indice]);
		}
		
	}

}
