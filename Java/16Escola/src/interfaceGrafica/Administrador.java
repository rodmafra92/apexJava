package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Administrador extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Administrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBoasvindas = new JLabel("Boa noite Administrador.");
		lblBoasvindas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBoasvindas.setBounds(10, 10, 199, 33);
		contentPane.add(lblBoasvindas);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 53, 390, 116);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnCadastrar = new JButton("Cadastrar Usu\u00E1rios");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Fechar o JFrame
				dispose();
				
				// Exibir o JFrame Usuario
				Usuarios a = new Usuarios();
				a.setVisible(true);
			}
		});
		btnCadastrar.setIcon(new ImageIcon("C:\\Users\\Rodrigo\\Desktop\\apexJava\\Java\\16Escola\\imagem\\usuario.png.png"));
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.add(btnCadastrar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Fechar o JFrame
				dispose();
				
				// Exibir o JFrame Login
				Login a = new Login();
				a.setVisible(true);
				
			}
		});
		btnSair.setIcon(new ImageIcon("C:\\Users\\Rodrigo\\Desktop\\apexJava\\Java\\16Escola\\imagem\\sairr.png.png"));
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 10));
		panel.add(btnSair);
	}
}
