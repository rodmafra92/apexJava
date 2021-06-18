package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controle.ProvaControle;
import modelo.UsuarioModelo;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Aluno extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public Aluno(UsuarioModelo um) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBoaNoiteAluno = new JLabel("Boa noite Aluno.");
		lblBoaNoiteAluno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBoaNoiteAluno.setBounds(10, 10, 199, 33);
		contentPane.add(lblBoaNoiteAluno);
		
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
		btnSair.setBounds(341, 18, 85, 21);
		contentPane.add(btnSair);
		
		//DefaultTableModel dtm = new DefaultTableModel();
		//dtm.addColumn("Prova");
		//dtm.addColumn("Nota");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 53, 416, 200);
		contentPane.add(scrollPane);
		
		table = new JTable(ProvaControle.provaAluno(um.getCodigo()));
		scrollPane.setViewportView(table);
	}
}
