package exercicio03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Pedir Peso
		int peso = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu peso"));
		
		// Pedir Altura
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Informe sua altura"));
		
		double imc = peso/(altura*altura);
		
		if(imc < 15) {
			JOptionPane.showMessageDialog(null," Muito Abaixo do peso.");
		}else if(imc<17.5) {
			JOptionPane.showMessageDialog(null, "Abaixo do Peso");
		}else if(imc<25) {
			JOptionPane.showMessageDialog(null, "Peso norma");
		}else if(imc < 30 ) {
			JOptionPane.showMessageDialog(null, "Acima do peso");
		}else if(imc < 35) {
			JOptionPane.showMessageDialog(null, "Obesidade 1");
		}else if(imc < 40) {
			JOptionPane.showMessageDialog(null, "Obesidade 2");
		}else{
			JOptionPane.showMessageDialog(null, "Obesidade 3");
		}
	
	}

}
