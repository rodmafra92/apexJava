package exercicio02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro n�mero."));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo n�mero."));
		
		int vl = Integer.parseInt(JOptionPane.showInputDialog("Informe a opera��o desejada: \n 1)para soma. \n 2)para subtra��o \n 3)para multiplica��o \n 4)para divis�o"));
		
		if(vl==1) {
			JOptionPane.showMessageDialog(null, "A soma dos n�meros � "+(n1+n2));
		}else if(vl==2){
			JOptionPane.showMessageDialog(null, "A subtra��o dos n�meros � "+(n1-n2));
		}else if(vl==3) {
			JOptionPane.showMessageDialog(null, "A multiplica��o dos n�meros � "+(n1*n2));
		}else if(vl==4){
			JOptionPane.showMessageDialog(null, "A divis�o dos n�meros � "+(n1/n2));
		}
	}

}
