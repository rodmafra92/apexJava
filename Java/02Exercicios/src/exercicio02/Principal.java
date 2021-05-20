package exercicio02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número."));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número."));
		
		int vl = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação desejada: \n 1)para soma. \n 2)para subtração \n 3)para multiplicação \n 4)para divisão"));
		
		if(vl==1) {
			JOptionPane.showMessageDialog(null, "A soma dos números é "+(n1+n2));
		}else if(vl==2){
			JOptionPane.showMessageDialog(null, "A subtração dos números é "+(n1-n2));
		}else if(vl==3) {
			JOptionPane.showMessageDialog(null, "A multiplicação dos números é "+(n1*n2));
		}else if(vl==4){
			JOptionPane.showMessageDialog(null, "A divisão dos números é "+(n1/n2));
		}
	}

}
