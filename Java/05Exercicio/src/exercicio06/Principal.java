package exercicio06;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnValidar;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblintro = new JLabel("Informe um e-mail valido.");
		lblintro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblintro.setBounds(10, 11, 259, 33);
		contentPane.add(lblintro);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(10, 55, 259, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnValidar = new JButton("Validar");
		btnValidar.setBounds(10, 99, 89, 23);
		contentPane.add(btnValidar);
	}

}
