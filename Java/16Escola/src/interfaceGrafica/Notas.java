package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Notas extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Notas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 240, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Rodrigo\\Desktop\\apexJava\\Java\\16Escola\\imagem\\notas.png.png"));
		lblNewLabel.setBounds(72, 17, 73, 79);
		contentPane.add(lblNewLabel);
		
		JComboBox cbxProvas = new JComboBox();
		cbxProvas.setBounds(10, 106, 202, 21);
		contentPane.add(cbxProvas);
		
		JComboBox cbxTurma = new JComboBox();
		cbxTurma.setBounds(10, 151, 202, 21);
		contentPane.add(cbxTurma);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Fechar o JFrame
				dispose();
				
				// Exibir o JFrame Professor
				Professor a = new Professor();
				a.setVisible(true);
			}
		});
		btnSair.setBounds(60, 201, 85, 21);
		contentPane.add(btnSair);
	}

}
