package exercicio05;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtFrase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 311, 191);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblintro = new JLabel("Informe uma palavra ou frase");
		lblintro.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblintro.setBounds(34, 11, 217, 43);
		contentPane.add(lblintro);
		
		txtFrase = new JTextField();
		txtFrase.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFrase.setBounds(10, 56, 262, 43);
		contentPane.add(txtFrase);
		txtFrase.setColumns(10);
		txtFrase.setHorizontalAlignment(JTextField.CENTER);
		
		JButton btnChecar = new JButton("Checar");
		btnChecar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String frase = txtFrase.getText();
				String inverso = new StringBuffer(frase).reverse().toString();
				
				if(frase.equals(inverso)) {
					JOptionPane.showMessageDialog(btnChecar, "É Palíndromo");
				}else {
					JOptionPane.showMessageDialog(btnChecar, "Não é Palíndromo");
				}
			}
		});
		btnChecar.setBounds(100, 109, 89, 23);
		contentPane.add(btnChecar);
	}

}
