package Principal;

import java.awt.EventQueue;



public class Principal {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaceGrafica.Principal frame = new interfaceGrafica.Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
