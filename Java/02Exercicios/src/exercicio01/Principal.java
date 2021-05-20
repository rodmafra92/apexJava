package exercicio01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
			
		String produto = JOptionPane.showInputDialog("Insira o nome do produto");
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do produto"));

		int forma = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1 - para pagamento a vista, \n2 -  para pagamento a prazo"));
		
		//String forma = JOptionPane.showInputDialog("A vista ou a prazo?");
		
		if(valor >= 500 && forma == 1) {
			JOptionPane.showMessageDialog(null, "O produto "+produto+"  terá 10% de desconto custando R$"+(valor*0.9));
		}else {
			JOptionPane.showMessageDialog(null, "O produto "+produto+" custara R$"+valor);
		}
	}

}
