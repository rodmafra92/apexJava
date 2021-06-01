package exemplo02;

import javax.swing.JOptionPane;

public class Aluno {

	// Atributos
	public String nome;
	public double nota1,nota2;
	
	// M�to de m�dia
	private double calculoMedia() {
		return (nota1+nota2)/2;
	}	
	
	// Metodo situa��o
	private String situacao(double media) {
		return media >= 7 ? "Aprovado" : "Reprovado";
	}
	
	// M�todo para retornar a m�dia e a situa��o
	public void mensagem() {
		double media = calculoMedia();
		String situacao = situacao(media);	
		
		JOptionPane.showMessageDialog(null, nome+" est� "+situacao+" com m�dia "+media);
	}	
}
