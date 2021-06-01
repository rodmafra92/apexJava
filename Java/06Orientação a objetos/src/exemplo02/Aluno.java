package exemplo02;

import javax.swing.JOptionPane;

public class Aluno {

	// Atributos
	public String nome;
	public double nota1,nota2;
	
	// Méto de média
	private double calculoMedia() {
		return (nota1+nota2)/2;
	}	
	
	// Metodo situação
	private String situacao(double media) {
		return media >= 7 ? "Aprovado" : "Reprovado";
	}
	
	// Método para retornar a média e a situação
	public void mensagem() {
		double media = calculoMedia();
		String situacao = situacao(media);	
		
		JOptionPane.showMessageDialog(null, nome+" está "+situacao+" com média "+media);
	}	
}
