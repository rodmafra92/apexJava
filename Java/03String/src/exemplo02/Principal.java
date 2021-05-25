package exemplo02;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		// JFrame
		JFrame frame = new JFrame();
		frame.setSize(800, 500);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// JTextField
		JTextField campo = new JTextField();
		campo.setBounds(50, 50, 400, 20);
		
		// A��o de Teclado
		campo.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				if(e.getKeyCode()!=8) {

					// Obter o termo digitado
					String valor = campo.getText();
				
					//Condicional
					if(valor.length()==2 || valor.length()==5) {
						campo.setText(valor+"/");
					}
				}
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		// Adicionar ao Jframe
		frame.add(campo);
		
		// Exibir o Form�lario
		frame.setVisible(true);

	}

}
