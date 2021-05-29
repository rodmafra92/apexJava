package exercicio09;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {
	
	int contador = 0;

	private JPanel contentPane;

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

		
		JLabel lblNewLabel = new JLabel("Vez do jogador: " + (contador % 2 == 0 ? "X" : "O"));
		lblNewLabel.setBounds(24, 11, 103, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnp1 = new JButton("");
		btnp1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnp1.setEnabled(false);
				btnp1.setText(contador % 2 == 0 ? "X" : "O");
				contador++;
				lblNewLabel.setText("Vez do jogador: " + (contador % 2 == 0 ? "X" : "O"));
				
			}
		});
		btnp1.setBounds(54, 81, 89, 23);
		contentPane.add(btnp1);
		
		JButton btnp4 = new JButton("");
		btnp4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnp4.setEnabled(false);
				btnp4.setText(contador % 2 == 0 ? "X" : "O");
				contador++;
				lblNewLabel.setText("Vez do jogador: " + (contador % 2 == 0 ? "X" : "O"));
			}
		});
		btnp4.setBounds(54, 115, 89, 23);
		contentPane.add(btnp4);
		
		JButton btnp7 = new JButton("");
		btnp7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnp7.setEnabled(false);
				btnp7.setText(contador % 2 == 0 ? "X" : "O");
				contador++;
				lblNewLabel.setText("Vez do jogador: " + (contador % 2 == 0 ? "X" : "O"));
			}
		});
		btnp7.setBounds(54, 149, 89, 23);
		contentPane.add(btnp7);
		
		JButton btnp2 = new JButton("");
		btnp2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnp2.setEnabled(false);
				btnp2.setText(contador % 2 == 0 ? "X" : "O");
				contador++;
				lblNewLabel.setText("Vez do jogador: " + (contador % 2 == 0 ? "X" : "O"));
			}
		});
		btnp2.setBounds(153, 81, 89, 23);
		contentPane.add(btnp2);
		
		JButton btnp5 = new JButton("");
		btnp5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnp5.setEnabled(false);
				btnp5.setText(contador % 2 == 0 ? "X" : "O");
				contador++;
				lblNewLabel.setText("Vez do jogador: " + (contador % 2 == 0 ? "X" : "O"));
			}
		});
		btnp5.setBounds(153, 115, 89, 23);
		contentPane.add(btnp5);
		
		JButton btnp8 = new JButton("");
		btnp8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnp8.setEnabled(false);
				btnp8.setText(contador % 2 == 0 ? "X" : "O");
				contador++;
				lblNewLabel.setText("Vez do jogador: " + (contador % 2 == 0 ? "X" : "O"));
			}
		});
		btnp8.setBounds(153, 149, 89, 23);
		contentPane.add(btnp8);
		
		JButton btnp9 = new JButton("");
		btnp9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnp9.setEnabled(false);
				btnp9.setText(contador % 2 == 0 ? "X" : "O");
				contador++;
				lblNewLabel.setText("Vez do jogador: " + (contador % 2 == 0 ? "X" : "O"));
			}
		});
		btnp9.setBounds(254, 149, 89, 23);
		contentPane.add(btnp9);
		
		JButton btnp6 = new JButton("");
		btnp6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnp6.setEnabled(false);
				btnp6.setText(contador % 2 == 0 ? "X" : "O");
				contador++;
				lblNewLabel.setText("Vez do jogador: " + (contador % 2 == 0 ? "X" : "O"));
			}
		});
		btnp6.setBounds(254, 115, 89, 23);
		contentPane.add(btnp6);
		
		JButton btnp3 = new JButton("");
		btnp3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnp3.setEnabled(false);
				btnp3.setText(contador % 2 == 0 ? "X" : "O");
				contador++;
				lblNewLabel.setText("Vez do jogador: " + (contador % 2 == 0 ? "X" : "O"));
			}
		});
		btnp3.setBounds(254, 81, 89, 23);
		contentPane.add(btnp3);
	}
}
