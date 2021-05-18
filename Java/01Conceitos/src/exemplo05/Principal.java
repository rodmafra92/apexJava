package exemplo05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//N�meros inteiros: Integer.parseInt()
		//Numeros reais: Double.parseDouble()
		
		try {
			int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
			int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro n�mero"));
		
			double media = (n1+n2)/2;
		
			JOptionPane.showMessageDialog(
					null, media >= 7 ? "Aprovado com m�dia "+media : "Reprovado com m�dia "+media
			);
		
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Falha ao executar. "+e.getMessage());
		}
	}

}
