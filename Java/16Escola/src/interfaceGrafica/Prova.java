package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.ProvaControle;
import modelo.UsuarioModelo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prova extends JFrame {

	private JPanel txtNumero;
	private JTextField txtProva;

	/**
	 * Create the frame.
	 */
	public Prova(UsuarioModelo um) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 297, 192);
		txtNumero = new JPanel();
		txtNumero.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(txtNumero);
		txtNumero.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Prova");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(31, 87, 87, 13);
		txtNumero.add(lblNewLabel);
		
		txtProva = new JTextField();
		txtProva.setBounds(82, 86, 177, 19);
		txtNumero.add(txtProva);
		txtProva.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Obter dados
				String nomeProva = txtProva.getText();
				int codigoProfessor = um.getCodigo();
				
				// Cadastrar no banco de dados
				boolean status = ProvaControle.cadastrar(codigoProfessor, nomeProva);
				JOptionPane.showMessageDialog(null, status == true ? "Prova cadastrada." : "Falha ao cadastrar." );
				
				// Limpar os campos
				txtProva.setText("");
				
				// Cursor no campo
				txtProva.requestFocus();
				
			}
		});
		btnCadastrar.setBounds(27, 110, 85, 21);
		txtNumero.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Fechar o JFrame
				dispose();
				
				// Exibir o JFrame Professor
				Professor p = new Professor(um);
				p.setVisible(true);
			}
		});
		btnCancelar.setBounds(174, 110, 85, 21);
		txtNumero.add(btnCancelar);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Rodrigo\\Desktop\\apexJava\\Java\\16Escola\\imagem\\teste2.png.png"));
		lblNewLabel_1.setBounds(103, 10, 79, 68);
		txtNumero.add(lblNewLabel_1);
	}

}
