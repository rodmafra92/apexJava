package exercicio01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textNota1;
	private JTextField textNota2;
	private JTextField textNota3;
	private JLabel lblNota1;
	private JLabel lblNota2;
	private JLabel lblNota3;

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
		setBounds(100, 100, 236, 228);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPedido = new JLabel("Informe suas notas.");
		lblPedido.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPedido.setBounds(10, 11, 201, 36);
		contentPane.add(lblPedido);
		
		textNota1 = new JTextField();
		textNota1.setBounds(60, 47, 86, 20);
		contentPane.add(textNota1);
		textNota1.setColumns(10);
		
		textNota2 = new JTextField();
		textNota2.setToolTipText("");
		textNota2.setBounds(60, 78, 86, 20);
		contentPane.add(textNota2);
		textNota2.setColumns(10);
		
		textNota3 = new JTextField();
		textNota3.setBounds(60, 109, 86, 20);
		contentPane.add(textNota3);
		textNota3.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
					double nota1 = Double.parseDouble(textNota1.getText());
					double nota2 = Double.parseDouble(textNota2.getText());
					double nota3 = Double.parseDouble(textNota3.getText());
				
					double media = ((nota1+nota2+nota3)/3);
					JOptionPane.showMessageDialog(btnCalcular, "sua média é "+media);
					
				}catch(Exception erro) {
					JOptionPane.showMessageDialog(lblPedido, "Falha ao enviar "+erro.getMessage());
				}
			}
		});
		btnCalcular.setBounds(63, 158, 83, 20);
		contentPane.add(btnCalcular);
		
		lblNota1 = new JLabel("1\u00AA Nota");
		lblNota1.setBounds(10, 50, 46, 14);
		contentPane.add(lblNota1);
		
		lblNota2 = new JLabel("2\u00AA Nota");
		lblNota2.setBounds(10, 81, 46, 14);
		contentPane.add(lblNota2);
		
		lblNota3 = new JLabel("3\u00AA Nota");
		lblNota3.setBounds(10, 112, 46, 14);
		contentPane.add(lblNota3);
	}
}
