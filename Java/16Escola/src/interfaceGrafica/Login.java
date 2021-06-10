package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmail;
	private JPasswordField pswSenha;
	private JLabel lblImagem;

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 249);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmail.setBounds(198, 61, 68, 22);
		contentPane.add(lblEmail);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSenha.setBounds(198, 108, 68, 27);
		contentPane.add(lblSenha);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(260, 56, 166, 27);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		pswSenha = new JPasswordField();
		pswSenha.setBounds(260, 111, 166, 27);
		contentPane.add(pswSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Fechar o JFrame
				dispose();
				
				// Exibir o JFrame Professor
				Administrador a = new Administrador();
				a.setVisible(true);
				
				
				
			}
		});
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEntrar.setBounds(260, 164, 85, 21);
		contentPane.add(btnEntrar);
		
		lblImagem = new JLabel("");
		lblImagem.setIcon(new ImageIcon("C:\\Users\\Rodrigo\\Desktop\\apexJava\\Java\\16Escola\\imagem\\iconfinder_6771595_education_graduation_learning_school_study_icon_128px.png"));
		lblImagem.setBounds(43, 42, 128, 128);
		contentPane.add(lblImagem);
	}
}
