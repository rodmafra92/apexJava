package exemplo04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Exibir uma mensagem.
		//JOptionPane.showMessageDialog(null, "Hello World!");
		
		//Obter um dad
		//String texto = JOptionPane.showInputDialog("Informe algo...");
		
		//Caida de confirma��o
		int opcao = JOptionPane.showConfirmDialog(null, "Gostando de Java?");
		JOptionPane.showMessageDialog(null, "O n�mero da op��o � "+opcao);
	}

}
