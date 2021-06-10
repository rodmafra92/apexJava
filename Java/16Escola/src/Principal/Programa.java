package Principal;

import java.awt.EventQueue;

import bd.Conexao;
import interfaceGrafica.Login;

public class Programa {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		Conexao.iniciarConexao();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}
