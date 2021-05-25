package exemplo01;

public class Principal {

	public static void main(String[] args) {
		
		// Variável
		String texto = "Quarta aula de Java Fundamentos";
		
		// Quantidade de caracteres.
		System.out.println(texto.length());
		
		// Obter caractere
		for(int i=0; i<texto.length(); i++) {
			System.out.println("O "+(i+1)+" caractere é "+ texto.charAt(i));
		}
		
		// Letras maiúsculas e minúsculas
		System.out.println(texto.toLowerCase());
		System.out.println(texto.toUpperCase());

		// Cortar Caracteres
		System.out.println(texto.substring(15));
		System.out.println(texto.substring(15, 19));
		
		// Remover espaços no começo e no final da variável
		String nome = "    Luciano  ";
		System.out.println(nome.trim());
		
		// Verificar existência de um caractere
		String email = "ralf.lima@gmail.com";
		System.out.println(email.indexOf("@"));
		
		// Código ASCII
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
