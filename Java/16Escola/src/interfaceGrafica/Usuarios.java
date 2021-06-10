package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Usuarios extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JPasswordField pswSenha;
	private JTextField txtEmail;
	private JTextField txtBairro;
	private JTextField txtRua;
	private JTextField txtNumero;
	private JTextField txtComplemento;

	/**
	 * Create the frame.
	 */
	public Usuarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 60, 45, 13);
		contentPane.add(lblNome);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(218, 60, 45, 13);
		contentPane.add(lblSenha);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(10, 106, 45, 13);
		contentPane.add(lblEmail);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(10, 152, 45, 13);
		contentPane.add(lblBairro);
		
		JLabel lblRua = new JLabel("Rua");
		lblRua.setBounds(218, 152, 45, 13);
		contentPane.add(lblRua);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(10, 204, 45, 13);
		contentPane.add(lblNumero);
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setBounds(218, 204, 80, 13);
		contentPane.add(lblComplemento);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(218, 106, 63, 13);
		contentPane.add(lblTelefone);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 83, 180, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(218, 123, 208, 19);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		pswSenha = new JPasswordField();
		pswSenha.setBounds(218, 83, 208, 19);
		contentPane.add(pswSenha);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(10, 123, 180, 19);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(10, 175, 180, 19);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);
		
		txtRua = new JTextField();
		txtRua.setBounds(218, 175, 208, 19);
		contentPane.add(txtRua);
		txtRua.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(10, 221, 180, 19);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtComplemento = new JTextField();
		txtComplemento.setBounds(218, 221, 208, 19);
		contentPane.add(txtComplemento);
		txtComplemento.setColumns(10);
		
		JComboBox<String> cbxTipo = new JComboBox<String>();
		cbxTipo.addItem("Tipo de conta");
		cbxTipo.addItem("Administrador");
		cbxTipo.addItem("Aluno");
		cbxTipo.addItem("Professor");
		cbxTipo.setBounds(10, 264, 416, 19);
		contentPane.add(cbxTipo);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(56, 303, 96, 32);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Fechar o JFrame
				dispose();
				
				// Exibir o JFrame Professor
				Administrador a = new Administrador();
				a.setVisible(true);
			}
		});
		btnCancelar.setBounds(271, 303, 96, 32);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Rodrigo\\Desktop\\apexJava\\Java\\16Escola\\imagem\\usuario.png.png"));
		lblNewLabel.setBounds(181, 0, 63, 64);
		contentPane.add(lblNewLabel);
	}
}
