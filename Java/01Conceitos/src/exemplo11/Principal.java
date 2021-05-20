package exemplo11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		// Vetor
		String[] nomes = new String[3];
		
		// Obter três nomes
		for(int indice=0;indice<3;indice++) {
			nomes[indice] = JOptionPane.showInputDialog("Informe o " +(indice+1)+ "º nome.");
		}
		
		// ForEach(Para Cada)
		for(String linha : nomes) {
			System.out.println(linha);
		}
		
	}

}
