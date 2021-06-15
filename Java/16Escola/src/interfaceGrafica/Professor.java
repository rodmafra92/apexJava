package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.UsuarioModelo;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Professor extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Professor(UsuarioModelo um) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBoaNoiteProfessor = new JLabel("Boa noite Professor " + um.getNome());
		lblBoaNoiteProfessor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBoaNoiteProfessor.setBounds(10, 10, 199, 33);
		contentPane.add(lblBoaNoiteProfessor);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 47, 616, 184);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnProva = new JButton("Cadastrar Prova");
		btnProva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Fechar o JFrame
				dispose();
				
				// Exibir o JFrame Prova
				Prova a = new Prova(um);
				a.setVisible(true);
			}
		});
		btnProva.setIcon(new ImageIcon("C:\\Users\\Rodrigo\\Desktop\\apexJava\\Java\\16Escola\\imagem\\teste2.png.png"));
		btnProva.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(btnProva);
		
		JButton btnNotas = new JButton("Notas");
		btnNotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Fechar o JFrame
				dispose();
				
				// Exibir o JFrame Login
				Notas a = new Notas(um);
				a.setVisible(true);
			}
		});
		btnNotas.setIcon(new ImageIcon("C:\\Users\\Rodrigo\\Desktop\\apexJava\\Java\\16Escola\\imagem\\notas.png.png"));
		btnNotas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(btnNotas);
		
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
		btnSair.setIcon(new ImageIcon("C:\\Users\\Rodrigo\\Desktop\\apexJava\\Java\\16Escola\\imagem\\sair2.png.png"));
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(btnSair);
	}

}
