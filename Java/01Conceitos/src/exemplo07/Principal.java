package exemplo07;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Vari�vel
		String cidade = JOptionPane.showInputDialog("Informe uma cidade.");
		
		// Switch
		switch(cidade) {
		case "Blumenau" :
		System.out.println("Cidade da Oktoberfest.");
		break;
		
		case "Florianopolis":
		System.out.println("Capital do estado.");
		break;
		
		default:
			System.out.println("Cidade n�o encontrada");
		}

	}

}
