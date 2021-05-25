package exemplo01;

public class Principal {

	public static void main(String[] args) {
		
		// Vari�vel
		String texto = "Quarta aula de Java Fundamentos";
		
		// Quantidade de caracteres.
		System.out.println(texto.length());
		
		// Obter caractere
		for(int i=0; i<texto.length(); i++) {
			System.out.println("O "+(i+1)+" caractere � "+ texto.charAt(i));
		}
		
		// Letras mai�sculas e min�sculas
		System.out.println(texto.toLowerCase());
		System.out.println(texto.toUpperCase());

		// Cortar Caracteres
		System.out.println(texto.substring(15));
		System.out.println(texto.substring(15, 19));
		
		// Remover espa�os no come�o e no final da vari�vel
		String nome = "    Luciano  ";
		System.out.println(nome.trim());
		
		// Verificar exist�ncia de um caractere
		String email = "ralf.lima@gmail.com";
		System.out.println(email.indexOf("@"));
		
		// C�digo ASCII
		char letra = 'a';
		System.out.println((int)letra);
		
		// Vetor de Texto
		String cursos = "HTML;JavaScript;Java;MySQL";
		
		String[] vetor = cursos.split(";");
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		
	}

}
